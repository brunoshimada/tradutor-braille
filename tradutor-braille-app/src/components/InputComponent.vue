<template>
  <input type="text" v-model="inputSearch" @keyup.enter="entered" />
</template>

<script>
export default {
  data() {
    return {
      inputSearch: '',
      outputSearch: ''
    }
  },
  methods: {
    entered() {
      let payload = {
        textoParaTraduzir: this.inputSearch
      }

      let options = {
        headers: {
          'Content-Type': 'application/json'
        },
        method: 'post',
        body: JSON.stringify(payload)
      }

      let url = new URL('http://localhost:9000/tradutorBraille/detailed')

      let response = fetch(url, options)

      response
        .then(response => {
          return response.json()
        })
        .then(json => {
          this.outputSearch = json
        })
        .catch(error => {
          console.error(error)
        })
        .finally(() => {
          this.$emit('output-avaliable', this.outputSearch)
        })
    }
  }
}
</script>

<style></style>
