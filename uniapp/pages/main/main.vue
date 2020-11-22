<template>
	<view class="content">
		<view class="order">
			<form @submit="">
				<view>
					<van-cell title="选择时间" is-link @click="showPopup"  :value="submitForm.timeValue"/>
					<van-popup :show="showOR" @close="onClose" round position="bottom" :style="{ height: '30%' }" class="popUp">
						<van-datetime-picker
						  type="date"
						  :value="currentDate"
						  :min-date="minDate"
						  :max-date="maxDate"
						  :formatter="formatter"
						  @cancel="cancelFn"
						  @confirm="confirmFn"
						/>
					</van-popup>
				</view>
				<van-cell-group>
					<navigator  url="../show-map/ShowMap?type=start">
						<van-field
						left-icon="location-o"
							autosize
						  :value="submitForm.slocation"
						  placeholder="请输入起点"
						  />	
					</navigator>
				  
				 <navigator url="../show-map/ShowMap?type=end">
					<van-field
					  left-icon="location-o"
					  :value="submitForm.elocation"
					  placeholder="请输入输入终点"
					  />
				  </navigator>	
				</van-cell-group>
				<van-button type="primary" size="normal" block @click="confirmInfo" color="#0faeff">确定</van-button>
				<van-popup :show="ConfirmOR" @close="ConfirmClose">请先选择时间，地点！</van-popup>
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
		        return {
					submitForm:{
						slocation:'',
						elocation:'',
						timeValue: ''
					},
		            showOR:false,
					ConfirmOR:false,
					minDate: new Date((new Date().getFullYear() ), 0, 1).getTime(),
					maxDate: new Date((new Date().getFullYear() + 1), 10, 1).getTime(),
					currentDate: new Date().getTime(),
					changeDate: new Date().getTime(),	
		        }
			},
		onShow() {
			let that=this;
			uni.getStorage({
				key:"start_item",
				success(res) {
					that.submitForm.slocation=res.data
					// that.$forceUpdate()
					console.log(res.data)
				},
				fail(err) {
					console.log(err.data)
				}
			})
			uni.removeStorage({
			    key: 'start_item',
			    success: function (res) {
			        console.log('success');
			    }
			});
			uni.getStorage({
				key:"end_item",
				success(res) {
					that.submitForm.elocation=res.data
					// that.$forceUpdate()
					console.log(res.data)
				},
				fail(err) {
					console.log(err.data)
				}
			})
			uni.removeStorage({
			    key: 'end_item',
			    success: function (res) {
			        console.log('success');
			    }
			});
			
			// console.log(this.submitForm)
		},
		onLoad() {
			// console.log(this.minDate)
			// console.log(this.maxDate)
			// console.log(this.currentDate)
			// this.timeFormate(new Date())
			
			uni.removeStorage({
			    key: 'start_item',
			    success: function (res) {
			        console.log('success');
			    }
			});
			uni.removeStorage({
			    key: 'end_item',
			    success: function (res) {
			        console.log('success');
			    }
			});
			
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
			confirmInfo(){
				let that=this;
				var submitForm=JSON.stringify(that.submitForm);
				console.log(this.submitForm);
				// if(this.submitForm){
					uni.navigateTo({
						url:'/pages/payment/payment?submitData='+submitForm
					})
				// }
				// else{
				// 	this.ConfirmOR=true;
				// 	// console.log("err");
				// }
				
			},
			ConfirmClose(){
				this.ConfirmOR=false	
			},
			showPopup(){
				this.showOR=true
			},
			onClose(){
				this.showOR=false
			},
			changeTime(time) {
			      if (time) {
			        var oDate = new Date(time * 1),
			          oYear = oDate.getFullYear(),
			          oMonth = oDate.getMonth() + 1,
			          oDay = oDate.getDate(),
			          
			          oTime =
			            oYear +
			            "-" +
			            this.getBz(oMonth) +
			            "-" +
			            this.getBz(oDay);

			        return oTime;
			      } else {
			        return "";
			      }
			    },
			    //补0
			    getBz(num) {
			      if (parseInt(num) < 10) {
			        num = "0" + num;
			      }
			      return num;
			    },
			confirmFn (e) {
				this.submitForm.timeValue =this.changeTime(e.mp.detail)
			  this.showOR = false
			},
			cancelFn () {
			  this.showOR = false
			},
			formatter(type,value){
				if(type==='year'){
					return `${value}年`;
				}else if(type==='month'){
					return `${value}月`;
				}
				return value;
			},
			
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
	.van-popup{
		font-size: 18px;
		font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
		font-weight: 400;
		width: 180px;
		line-height: 30px;
		text-align: center;
	}
	/* .popUp{
		height: 30%;
	} */
</style>
