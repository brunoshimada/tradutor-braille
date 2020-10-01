<template>
  <div class="ui action input" id="inputBox">
    <input
      placeholder="O que vamos traduzir hoje?"
      type="text"
      v-model="inputSearch"
      @keyup.enter="entered"
    />
    <button class="ui button teal" id="inputBtn" @click="entered">
      Traduzir
    </button>
  </div>
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

<style scoped>
#inputBox {
  height: 5vh;
  width: 50vw;
  margin: auto;
  font-size: 20px;
  margin: 10px 0px;
  padding-top: 10px;
  padding-bottom: 10px;
}

#inputBtn {
  font-size: 15px;
}
</style>
