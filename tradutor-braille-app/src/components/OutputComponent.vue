<template>
  <p :id="id" :title="originalInput">{{ charCode }}</p>
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

<style></style>
