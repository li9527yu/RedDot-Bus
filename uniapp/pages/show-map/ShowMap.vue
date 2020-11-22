<template>
    <view class="content">
        <view class="top">
            <input type="text" placeholder="请输入出发地点" :value="searchKey" @input="search" class="searchIn"/>
            <scroll-view scroll-y="true" class="option" v-show="IsOption">
                <view class='column_item' v-for='(item,index) in data' :key='index' @click="tapOption(item)" >{{item.title}}</view>
            </scroll-view>
			<van-button type="primary" size="normal" block @click="backInfo" color="#0faeff">确定</van-button>
        </view>
        <view >
            <view class="page-section page-section-gap">
              <map
                id="myMap"
                style="width: 100%; height: 280px;"
                :latitude="latitude"
                :longitude="longitude"
                :markers="markers"
                :covers="covers"
                 @poitap = "poitap"
                show-location
              ></map>
            </view>
        </view>
    </view>
</template>

<script>
    // 引入SDK核心类
    var QQMapWX = require('../../common/qqmap/qqmap-wx-jssdk1.2/qqmap-wx-jssdk.min.js');
    var qqmapsdk;
    var self;
    export default {
        data() {
            return {
				selectType:'',
                data:[],
                IsOption:false,
                searchKey:"",
                
                latitude: '',
                longitude:'',
                    markers: [{
                      id: 1,
                      latitude: 23.099994,
                      longitude: 113.324520,
                      name: 'T.I.T 创意园'
                    }],
                    covers: [{
                      latitude: 23.099994,
                      longitude: 113.344520,
                      iconPath: '../../static/img/home.png'
                    }, {
                      latitude: 23.099994,
                      longitude: 113.304520,
                      iconPath: '../../static/img/home.png'
                    }],
            }
        },
        onLoad(option) {
            self = this
            self.mapCtx = wx.createMapContext('myMap')
            self.getAuthorizeInfo()
                 // 实例化API核心类
                 qqmapsdk = new QQMapWX({
                            key: 'BRNBZ-KY7Y4-FXYUP-X3KHF-XK5CT-FTBKZ'
                        });
						
			this.selectType=option.type;       
        },
        methods: {
                bindChange:function(e){
                    console.log(e)
                },
                // 搜索框
                  search:  function(e){
                    console.log(e)
                    self.searchKey = e.detail.value
                    var location = self.latitude+","+ self.longitude
                     self.mapSearch(self.searchKey,location).then(res => {
                                self.data = res.data
                                if(self.searchKey && self.data.length){
                                    self.IsOption = true
                                }else{
                                    self.IsOption = false
                                }
                                
                            },error => {
                                // self.$api.msg('请求失败')
                                // console.log(error,"aaaaaaaaaaa");
                        })
                    
                },
                tapOption:function(item){
                    self.searchKey = item.title
                    self.IsOption = false
                    self.data = []
                    var obj = {}
                    obj.latitude = item.location.lat;
                    obj.longitude = item.location.lng;
                    // console.log(item,"danji",obj)
                    self.toLocation(obj)
                },
                toLocation:function(obj){
                    self.mapCtx.moveToLocation(obj)
                    self.mapCtx.translateMarker({
                      markerId: 1,
                      autoRotate: true,
                      duration: 100,
                      destination: {
                        latitude:obj.latitude,
                        longitude:obj.longitude,
                      },
                      animationEnd() {
                        console.log('animation end')
                      }
                    })
                },
                // 
                 mapSearch:function(keyword,location){
                console.log(keyword,location,"keyword,location")
                    let promise = new Promise(function(resolve, reject) {
                        // 调用接口
                              qqmapsdk.search({
                                    keyword: keyword,//搜索关键词
                                    location:location ,  //设置周边搜索中心点
                                  success: function (res) {
                                     resolve(res)
                                  },
                                  fail: function (res) {
                                     reject(res)
                                  }
                          });
                    })
                    return promise
                      
                },
                // 位置授权
                 getAuthorizeInfo(){
                              uni.authorize({
                                  scope: 'scope.userLocation',
                                  success() { // 允许授权
                                      self.getLocationInfo();
									  console.log("success")
                                  },
                                  fail(){    // 拒绝授权
                                      self.openConfirm();
                                      console.log("你拒绝了授权，无法获得周边信息")
                                  }
                              })
                          },
                          // 获取地理位置
                getLocationInfo(){  
                              uni.getLocation({
                                  type: 'wgs84',
                                  success (res) {
                                      console.log(res,"当前位置");
                                     self.toLocation(res)
                                     self.latitude = res.latitude;
                                     self.longitude = res.longitude;
                                            // uni.openLocation({
                                            //     latitude: latitude,
                                            //     longitude: longitude,
                                            //     success: function () {
                                            //         console.log('success');
                                            //     }
                                            // })
                                  }
                              });
                          },
                  
                          // 再次获取授权
                          // 当用户第一次拒绝后再次请求授权
                openConfirm(){
                              uni.showModal({
                                  title: '请求授权当前位置',
                                  content: '需要获取您的地理位置，请确认授权',
                                  success: (res)=> {
                                      if (res.confirm) {
                                          uni.openSetting();// 打开地图权限设置
                                      } else if (res.cancel) {
                                          uni.showToast({
                                              title: '你拒绝了授权，无法获得周边信息',
                                              icon: 'none',
                                              duration: 1000
                                          })
                                      }
                                  }
                              });
                 },
                 
                 
                 
                 
                 poitap: function(e){
                    console.log(e,"poitap")
                    var obj = e.detail
                    self.searchKey = obj.name
                    // this.$api.msg(e)
                    self.toLocation(obj)
                 },
                 getCenterLocation: function () {
                    this.mapCtx.getCenterLocation({
                      success: function(res){
                        console.log(res.longitude)
                        console.log(res.latitude)
                      }
                    })
                  },
                // 下一步
                Next:function(){
                    uni.navigateTo({
                      url: './addFishpond2'
                    })  
                },
                // 取消删除
                Cancel:function(){
                    
                },
				backInfo(){
					if(this.selectType=='start'){
						uni.setStorage({
							key:"start_item",
							data:this.searchKey
						})
					}
					else if(this.selectType=='end')
					{
						uni.setStorage({
							key:"end_item",
							data:this.searchKey
						})
					}
					uni.switchTab({
						url:'../main/main'
					})
				}
        }
    }
</script>

<style>
    .content {
        background-color: #F1F1F1;
        overflow: hidden;
        min-height: 100vh;
        color: #646464;
        font-size:40rpx ;
    }
    .top>input{
        height: 88rpx;
        width: 524rpx;
        margin: 40rpx auto 0;
        padding:0 40rpx;
        border: solid 2rpx #BEBEBE;
    }
    .option{
        max-height: 300rpx;
        width: 100%;
    
        line-height: 60rpx;
        position: fixed;
        top: 128rpx;
        z-index: 99999;
    }
    .column_item{
        padding:0 40rpx;
        height: 60rpx;
        width: 524rpx;
        overflow: hidden;
        margin:0rpx auto;
        background-color: #fff;
        text-overflow: ellipsis;
        white-space: nowrap;
    }
    .column_item:active{
        background-color: #8F8F94;
    }
    
    .page-section-gap{
      box-sizing: border-box;
      /* padding: 0 30rpx; */
      margin: 30rpx auto;
      width: 600rpx;
    }
    
</style>
