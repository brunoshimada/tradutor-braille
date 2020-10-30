<template>
  <div :id="id" @mouseover="onHover" @mouseleave="onLeave" class="output">
    <p>{{ displayText }}</p>
  </div>
</template>

<script>
export default {
  props: {
    id: {
      type: Number,
      required: true
    },
    charCode: {
      type: String,
      required: true
    },
    originalInput: {
      type: String,
      required: true
    }
  },
  data() {
    return {
      displayText: this.charCode
    }
  },
  methods: {
    onHover() {
      this.displayText = this.originalInput
    },
    onLeave() {
      this.displayText = this.charCode
    }
  }
}
</script>

<style scoped>
div {
  width: 15%;
  height: 10vh;
  margin: 10px 10px;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
  border: 1px #ccfffd solid;
  border-radius: 30px;
}

p {
  font-size: 30px;
}
</style>
