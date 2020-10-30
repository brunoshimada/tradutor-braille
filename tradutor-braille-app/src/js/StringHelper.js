export function clean(input) {
  return limpar(input)
}

function limpar(input) {
  return limparAcentuacao(limparCedilha(input))
}

function limparCedilha(input) {
  return input.replace('ç', 'c')
}

function limparAcentuacao(input) {
  return input
    .replace(/[ãâáà]/g, 'a')
    .replace(/[êé]/g, 'e')
    .replace('í', 'i')
    .replace(/[ôó]/g, 'o')
    .replace('ú', 'u')
}
