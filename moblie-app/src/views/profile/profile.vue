<template>
  <div class="Profile">
    <file-card></file-card>
    <grid></grid>
    <info-list></info-list>
    <h2>Profile</h2>
  </div>
</template>

<script>
import FileCard from '@/components/common/FileCard/FileCard'
import InfoList from '@/components/common/InfoList/InfoList'
import Grid from '@/components/content/Grid/Grid'
export default {
  name: 'Profle',
  components: {
    FileCard,
    InfoList,
    Grid
  }
}
</script>

<style>
   span{
        font-size: 16px;
        font-weight: 400;
    }
</style>
