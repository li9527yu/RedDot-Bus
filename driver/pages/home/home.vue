<template>
	<view>
		<view class="page-body">
			<view class="page-section page-section-gap">
				<map style="width: 100%; height: 300px;" :latitude="latitude" :longitude="longitude" :markers="covers">
				</map>
			</view>
		</view>
		<button @click="start()">开始记录</button>
		<button @click="stop()">停止记录</button>
		<view>
			{{'当前位置的纬度：' + latitude}}
		</view>
		<view>
			{{'当前位置的纬度：' + longitude}}
		</view>
	</view>
</template>

<script>
	export default {
		mounted() {
			uni.getLocation({
			    type: 'gcj02',
			    success: (res) => {
			        console.log('当前位置的纬度：' + res.latitude);
					this.latitude = res.latitude;
					this.covers[0].latitude = res.latitude;
			        console.log('当前位置的经度：' + res.longitude);
					this.longitude = res.longitude;
					this.covers[0].longitude = res.longitude;
			    }
			});
		},
		data() {
			return {
				id: 0, // 使用 marker点击事件 需要填写id
				title: 'map',
				latitude: 0.0,
				longitude: 0.0,
				interval: null,
				covers: [{
					latitude: 0.909,
					longitude: 116.39742,
					iconPath: '../../static/location.png'
				}]
			}
		},
		methods: {
			start: function(){
				this.interval = setInterval(() => {
					uni.getLocation({
					    type: 'gcj02',
					    success: (res) => {
					        console.log('当前位置的纬度：' + res.latitude);
					        this.latitude = res.latitude;
					        this.covers[0].latitude = res.latitude;
					        console.log('当前位置的经度：' + res.longitude);
					        this.longitude = res.longitude;
					        this.covers[0].longitude = res.longitude;
					    }
					});
				}, 1000);
			},
			stop: function() {
				clearInterval(this.interval)
			}
		},
	}
</script>

<style>

</style>
