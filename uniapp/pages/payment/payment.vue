<template>
	<view>
		<view>
			<text>用车时间：{{acceptData.time}}</text>
			<text>出发点：{{acceptData.start}}</text>
			<text>目的地：{{acceptData.end}}</text>
		</view>
		<view></view>
		<view>
			<view><text>金额：</text></view>
			<view><button @click="payFor">确认支付</button></view>
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
					end:''
				}
			}
		},
		onLoad(options) {
			var data=JSON.parse(options.submitData)
			this.acceptData.time=data.date;
			this.acceptData.start=data.slocation;
			this.acceptData.end=data.elocation;
			// console.log(this.time)
			// console.log(data)
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
</style>
