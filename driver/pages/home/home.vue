<template>
	<view>
		<view class="page-body">
			<view class="page-section page-section-gap">
				<map style="width: 100%; height: 300px;" :latitude="latitude" :longitude="longitude" :markers="covers">
				</map>
			</view>
		</view>
		<button @click="start()">开始记录</button>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				id: 0, // 使用 marker点击事件 需要填写id
				title: 'map',
				latitude: 38.909,
				longitude: 116.39742,
				covers: [{
					latitude: this.latitude,
					longitude: this.longitude,
					iconPath: '../../static/location.png'
				}]
			}
		},
		methods: {
			start: function(){
				setInterval(function() {
					uni.getLocation({
					    type: 'gcj02',
					    success: function (res) {
					        console.log('当前位置的经度：' + res.longitude);
							// this.longitude = res.longitude;
					        console.log('当前位置的纬度：' + res.latitude);
							// this.latitude = res.latitude;
					    }
					});
				}, 10);
			}
		},
	}
</script>

<style>

</style>
