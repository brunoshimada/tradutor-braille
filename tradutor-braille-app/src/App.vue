<template>
  <div id="app">
    <InputComponent @output-avaliable="outputProcessor"></InputComponent>

    <OutputComponent
      v-for="(item, index) in data"
      :key="index"
      :id="index"
      :title="item.originalInput"
      :charCode="item.charCode"
    ></OutputComponent>
  </div>
</template>

<script>
import InputComponent from '@/components/InputComponent'
import OutputComponent from '@/components/OutputComponent'

export default {
  name: 'App',
  components: {
    InputComponent,
    OutputComponent
  },
  data() {
    return {
      data: []
    }
  },
  methods: {
    outputProcessor(outputAvaliable) {
      this.data = outputAvaliable.caracteresTraduzidos
    }
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
