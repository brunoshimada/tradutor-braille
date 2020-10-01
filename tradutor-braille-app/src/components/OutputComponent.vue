<template>
  <div :id="id" :title="originalInput">
    <p>{{ charCode }}</p>
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
    return {}
  }
}
</script>

<style scoped>
div {
  width: 20vw;
  height: 10vw;
  margin: auto;
  display: flex;
  justify-content: center;
  align-items: center;
  text-align: center;
}

p {
  font-size: 50px;
}
</style>
