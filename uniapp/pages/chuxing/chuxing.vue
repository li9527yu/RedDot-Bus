<template>
	<view>
		<view class="page-body">
		     <view class="page-section page-section-gap">
				<map 
					style="width:750rpx; height:400rpx;" 
					:latitude="latitude" 
					:longitude="longitude" 
					:markers="covers"
					
					:polyline="polyline"
					scale="16"
					>
		        </map>
		     </view>
			 <view class="qrimg">
				 <tki-qrcode class="qrcode"
				  v-if="ifShow" 
				  cid="qrcode1" 
				  ref="qrcode" 
				  :val="val" :size="size" 
				  :unit="unit" 
				  :background="background" 
				  :foreground="foreground" 
				  :pdground="pdground" 
				  :icon="icon" :iconSize="iconsize" 
				  :lv="lv" :onval="onval" 
				  :loadMake="loadMake" 
				  :usingComponents="true" />
				  <text style="padding-left: 40px;">乘车码</text>
			 </view>
		</view>
	</view>
</template>

<script>
	// var QQMapWX = require('../../common/qqmap/qqmap-wx-jssdk1.2/qqmap-wx-jssdk.min.js');
	// var qqmapsdk;
	// var self;
	import tkiQrcode from "@/components/tki-qrcode/tki-qrcode.vue"
	export default {
	    data() {
	        return {
				//地图
				id:0, // 使用 marker点击事件 需要填写id
				latitude: 23.099994,
				longitude: 113.324520,
				name: 'T.I.T 创意园',
				covers: [{
				     latitude:23.099994,
				     longitude:113.324520,
				     iconPath: '../../static/img/location.png'
				},{
				     latitude: 23.088888,
				     longitude: 113.20000,
				     iconPath: '../../static/img/location.png'
				}],
				polyline: [{
					points: [
					   {latitude: 23.099994,longitude: 113.324520}, 				
					   {latitude: 23.088888,longitude: 113.20000}
					],
					width: 10,
					color: "#00aaff",
					dottedLine: false,
				}],
				//二维码
				ifShow: true,
				val: '二维码', // 要生成的二维码值
				size: 300, // 二维码大小
				unit: 'upx', // 单位
				background: '#ffffff', // 背景色
				foreground: '#000000', // 前景色
				pdground: '#000000', // 角标色
				icon: '', // 二维码图标
				iconsize: 40, // 二维码图标大小
				lv: 3, // 二维码容错级别 ， 一般不用设置，默认就行
				onval: false, // val值变化时自动重新生成二维码
				loadMake: true, // 组件加载完成后自动生成二维码
				src: '' // 二维码生成后的图片地址或base64
			}
		},
	    methods: {
	
	    },
		components: {tkiQrcode},
}
		
</script>

<style> 
.qrimg{
	padding: 100px 100px;
}
</style>
