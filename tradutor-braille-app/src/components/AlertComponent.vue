<template>
  <div class="ui icon message">
    <i class="question circle outline icon"></i>
    <i class="close icon" @click="close"></i>
    <div class="content">
      <div class="header">
        Precisa de ajuda?
      </div>
      <p>Tente passar com o mouse em cima do código braile!</p>
    </div>
  </div>
</template>

<script>
export default {
  methods: {
    close() {
      this.$emit('close-alert')
    }
  }
}
</script>

<style></style>
