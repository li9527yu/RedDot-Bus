<template>
	<view>
		<button v-on:click="scan()">扫码</button>
		<!-- <camera mode="scanCode" device-position="back" flash="off"  @scancode="takeCode"></camera> -->
		{{result}}
	</view>
</template>

<script>
	export default {
		data() {
			return {
				result: ""
			}
		},
		methods: {
			// takeCode: (e) => {
			//     if(scanFunctionIsUseable) {
			//         this.scanFunctionIsuseable = false;
			//         // 对扫码结果进行处理
			//         console.log(e.detail.result);
			
			//         // 扫码间隔两秒
			//         setTimeout(() => {
			//         this.scanFunctionIsUseable = true;
			//         }, 2000)
			//     }
			// }
			scan: () => {
				uni.scanCode({
				    onlyFromCamera: true,
				    success: function (res) {
				        console.log('条码类型：' + res.scanType);
				        console.log('条码内容：' + res.result);
				    }
				});
			}
		}
	}
</script>

<style>

</style>
