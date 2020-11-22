
<template>
    <carousel :img-list="imgList" url-key="url" @selected="selectedBanner"/>
</template>
<script>
	import carousel from '../../components/vear-carousel/vear-carousel.vue'
	export default {
	    components: {
	        carousel
	    },
	    data() {
	        return {
	            imgList: [{
	                url: 'http://p1.music.126.net/kHjxtEBJBVaP7LarvXBHzg==/109951165487221583.jpg?imageView&quality=89',
	                id: 1
	            },{
	                url: 'http://p1.music.126.net/uyp9_L3i1VNKIqiCSvDBfQ==/109951165487249974.jpg?imageView&quality=89',
	                id: 2
	            },{
	                url: 'http://p1.music.126.net/phMJS0iQqwQOM8IuI2nAWg==/109951165486875236.jpg?imageView&quality=89',
	                id: 3
	            },{
	                url: 'http://p1.music.126.net/xAgh9mDbpEPAXas0JyUTSw==/109951165487249529.jpg?imageView&quality=89',
	                id: 4
	            },]
	        }
	    },
	    methods: {
	        selectedBanner(item, index) {
	            console.log('🥒', item, index)
	        }
	    }
	}
</script>
<style></style>

  
