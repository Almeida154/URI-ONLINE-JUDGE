var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var nome = lines.shift()
var saláriofixo = Number(lines.shift())
var totalvendas = Number(lines.shift())
var rsadd = (totalvendas*15)/100
var novosalário = saláriofixo + rsadd
console.log(`TOTAL = R$ ${novosalário.toFixed(2)}`)
