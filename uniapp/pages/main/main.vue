<template>
	<view class="content">
		<view class="order">
			<form @submit="">
				<view class="uni-list">
					<view class="uni-list-cell">
						<view class="uni-list-cell-db">
							<picker mode="date" :value="submitForm.date" :start="startDate" :end="endDate" @change="bindDateChange">
								<view class="uni-input"><text>当前选择日期为：</text>{{submitForm.date}}</view>
							</picker>
						</view>
					</view>
				</view>
				<navigator  url="../show-map/ShowMap">
					<input type="text" focus  placeholder="输入起点" @input="start_location" />
				</navigator>
				<!-- <navigator url="../show-map/ShowMap"> -->
					<input type="text" focus  placeholder="输入终点"  @input="end_location"/>
				<!-- </navigator>			 -->
				<button form-type="submit" @click="confirmInfo">下单</button>
				<van-button type="primary" size="large" block>确定</van-button>
			</form>
		</view>
	</view>
</template>

<script>
	import {
		mapState,
		mapMutations
	} from 'vuex'

	export default {
		data() {
		        const currentDate = this.getDate({
		            format: true
		        })
		        return {
					submitForm:{
						slocation:'',
						elocation:'',
						date: currentDate
					},
		            
		        }
		    },
		computed: {
			// mapState(['forcedLogin', 'hasLogin', 'userName']),
			startDate() {
			    return this.getDate('start');
			},
			endDate() {
			    return this.getDate('end');
			}
		},
		onShow() {
			
			console.log(this.submitForm)
		},
		onLoad(option) {
			// let that=this
			// that.submitForm.slocation=JSON.parse(options.backData)
			
			// var backInfo_start=JSON.parse(option.backData)
			// console.log(backInfo_start)
			
			const loginType = uni.getStorageSync('login_type')
			if (loginType === 'local') {
				this.login(uni.getStorageSync('username'))
				return
			}
			let uniIdToken = uni.getStorageSync('uniIdToken')
			if (uniIdToken) {
				this.login(uni.getStorageSync('username'))
				uniCloud.callFunction({
					name: 'user-center',
					data: {
						action: 'checkToken',
					},
					success: (e) => {

						console.log('checkToken success', e);

						if (e.result.code > 0) {
							//token过期或token不合法，重新登录
							if (this.forcedLogin) {
								uni.reLaunch({
									url: '../login/login'
								});
							} else {
								uni.navigateTo({
									url: '../login/login'
								});
							}
						}
					},
					fail(e) {
						uni.showModal({
							content: JSON.stringify(e),
							showCancel: false
						})
					}
				})
			} else {
				this.guideToLogin()
			}
			
			
		},
		
		methods: {
			...mapMutations(['login']),
			guideToLogin() {
				uni.showModal({
					title: '未登录',
					content: '您未登录，需要登录后才能继续',
					/**
					 * 如果需要强制登录，不显示取消按钮
					 */
					showCancel: !this.forcedLogin,
					success: (res) => {
						if (res.confirm) {
							/**
							 * 如果需要强制登录，使用reLaunch方式
							 */
							if (this.forcedLogin) {
								uni.reLaunch({
									url: '../login/login'
								});
							} else {
								uni.navigateTo({
									url: '../login/login'
								});
							}
						}
					}
				});
			},
			getDate(type) {
			            const date = new Date();
			            let year = date.getFullYear();
			            let month = date.getMonth() + 1;
			            let day = date.getDate();
			
			            if (type === 'start') {
			                year = year;
			            } else if (type === 'end') {
			                year = year+1;
			            }
			            month = month > 9 ? month : '0' + month;;
			            day = day > 9 ? day : '0' + day;
			            return `${year}-${month}-${day}`;
			        },
			bindDateChange: function(e) {
				this.submitForm.date = e.target.value
			},
			start_location(e){
				// console.log(e.detail);
				this.submitForm.slocation=e.detail.value;
			},
			end_location(e){
				// console.log(e.detail);
				this.submitForm.elocation=e.detail.value;
			},
			confirmInfo(){
				let that=this;
				var submitForm=JSON.stringify(that.submitForm);
				// console.log(this.submitForm);
				uni.navigateTo({
					url:'/pages/payment/payment?submitData='+submitForm
				})
				// console.log(this.submitForm.elocation)
				// console.log(this.submitForm.slocation)
				// console.log(this.submitForm.date)
			}
		}

	}
</script>

<style>
	.hello {
		display: flex;
		flex: 1;
		flex-direction: column;
	}

	.title {
		color: #8f8f94;
		margin-top: 25px;
	}

	.ul {
		font-size: 15px;
		color: #8f8f94;
		margin-top: 25px;
	}

	.ul>view {
		line-height: 25px;
	}
</style>
