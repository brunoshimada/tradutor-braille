<template>
  <transition name="modal-fade">
    <div class="modal-backdrop" role="dialog">
      <div class="modal" ref="modal">
        <section class="modal-header">
          <i class="massive teal frown outline icon"></i>
        </section>
        <section class="modal-body">
          {{ message }}
        </section>

        <footer class="modal-footer">
          <slot name="footer">
            <button
              type="button"
              class="btn"
              @click="close"
              aria-label="Close modal"
            >
              Voltar
            </button>
          </slot>
        </footer>
      </div>
    </div>
  </transition>
</template>

<script>
export default {
  props: {
    message: {
      type: String,
      required: false
    }
  },
  data() {
    return {}
  },
  methods: {
    close() {
      this.$emit('close-modal')
    }
  }
}
</script>

<style scoped>
.btn {
  padding: 8px 16px;
  border-radius: 3px;
  font-size: 14px;
  cursor: pointer;
}

.modal-backdrop {
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  background-color: rgba(0, 0, 0, 0.85);
  display: flex;
  justify-content: center;
  align-items: center;
}

.modal {
  background: transparent;
  overflow-x: auto;
  display: flex;
  flex-direction: column;
  border-radius: 10px;
  width: 60%;
}

.modal-footer {
  padding: 15px;
  display: flex;
  justify-content: flex-end;
}

.modal-footer button {
  background: transparent;
}

.modal-body {
  position: relative;
  padding: 20px 10px;
  color: #fff;
}

.btn-close {
  border: none;
  font-size: 20px;
  padding: 20px;
  cursor: pointer;
  font-weight: bold;
  color: #008080;
  background: transparent;
}

.btn {
  color: white;
  background: #4aae9b;
  border: 1px solid #008080;
  border-radius: 2px;
}

.modal-fade-enter,
.modal-fade-leave-active {
  opacity: 0;
}

.modal-fade-enter-active,
.modal-fade-leave-active {
  transition: opacity 0.5s ease;
}
</style>
