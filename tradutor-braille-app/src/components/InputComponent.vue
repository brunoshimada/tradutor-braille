<template>
  <div class="ui action input" id="inputBox">
    <input
      placeholder="O que vamos traduzir hoje?"
      type="text"
      v-model="inputSearch"
      @keyup.enter="entered"
    />
    <button class="large ui button teal" id="inputBtn" @click="entered">
      Traduzir
    </button>
  </div>
</template>

<script>
import { doRequest } from '../js/RequestHelper'
import { clean } from '../js/StringHelper'

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
        textoParaTraduzir: clean(this.inputSearch)
      }

      let options = {
        headers: {
          'Content-Type': 'application/json'
        },
        method: 'post',
        body: JSON.stringify(payload)
      }

      let url = new URL('http://localhost:9000/tradutorBraille/detailed')

      let response = doRequest(url, options)

      response
        .then(response => {
          if (response.success) {
            this.outputSearch = response.body
            this.$emit('output-avaliable', this.outputSearch)
          } else {
            this.$emit('output-error', response.body)
          }
        })
        .finally(() => (this.inputSearch = ''))
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
  font-size: 18.5px;
}
</style>
