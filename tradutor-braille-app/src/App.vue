<template>
  <div id="app">
    <InputComponent @output-avaliable="outputProcessor"></InputComponent>

    <div id="output-box">
      <OutputComponent
        v-for="(item, index) in data"
        :key="index"
        :id="index"
        :originalInput="item.originalInput"
        :charCode="item.charCode"
      ></OutputComponent>
    </div>
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
@import url('https://fonts.googleapis.com/css2?family=Fira+Mono&display=swap');

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Fira Mono', monospace;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  width: 90vw;
  margin: auto;
}

#output-box {
  display: flex;
  background-color: lightblue;
  border-radius: 30px;
}
</style>
