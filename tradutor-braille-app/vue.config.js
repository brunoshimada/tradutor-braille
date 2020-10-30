const path = require('path')

module.exports = {
  outputDir: path.resolve(
    __dirname,
    '../tradutor-braille-service/src/main/resources/static'
  ),
  chainWebpack: config => {
    config.plugin('html').tap(args => {
      args[0].title = 'Tradutor Braille App'
      return args
    })
  }
}
