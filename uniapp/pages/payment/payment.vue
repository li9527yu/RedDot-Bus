<template>
	<view class="payment">
		<view class="detail">
			<van-cell-group class="detail-context">
			  <van-cell title="用车时间 :" :value="acceptData.time"   />
			  <van-cell title="出发点 :" :value="acceptData.start" left-icon="location-o"/>
			  <van-cell title="目的地 :" :value="acceptData.end" left-icon="location-o"  />
			  <van-cell title="选择车型" value="" is-link />			  
			</van-cell-group>
		</view>
		<view>
			
		</view>
		<view class="userdetail">
			<van-cell-group>
			  <van-field
			    :value="username"
			    label="包车人"
			    placeholder="请输入名字"
				class="user"
			  />
			  <van-field
			    :value="phone"
			    label="手机号"
			    placeholder="请输入手机号"
				class="user"
			  />
			</van-cell-group>
		</view>
		<view class="confirmPay">
			 <van-cell title="金额 :" value="" class="money"/>
			<van-button type="primary" size="large" class="confirmTo"  color="#0faeff">确认支付</van-button>
		</view>
	</view>
</template>

<script>
	export default{
		data(){
			return{
				acceptData:{
					time:'',
					start:'',
					end:'',
					username:'',
					phone:''
				},
				
			}
		},
		onLoad(options) {
			var data=JSON.parse(options.submitData)
			this.acceptData.time=data.timeValue;
			this.acceptData.start=data.slocation;
			this.acceptData.end=data.elocation;
		},
		methods:{
			payFor(){
				uni.request({
					url:'',
					data:{
						
					},
					header:{
						
					},
					success:(res)=> {
						console.log(res.data)
					}
				})
			}
		}
	}
</script>

<style>
	.payment{
		position: relative;
		top: 0;
		bottom: 0;
		left: 0;
		right: 0;
		width: 100%;
	}
	.detail{
		width: 100%;
		background-color: #000000;
	}
	.van-cell{
		width: 200px;
		background-color: #007AFF;
	}
	.confirmPay{
		position: fixed;
		bottom: 0;
		left: 0;
		right: 0;
	}
	.money,.confirmTo{
		display:inline-block;
		width: 50%;
	}
	.userdetail{
		margin: 10px 0 0 	 ;
	}
</style>
