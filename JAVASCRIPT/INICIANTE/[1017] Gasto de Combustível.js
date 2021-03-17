var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var horas = parseFloat(lines.shift())
var vm = parseFloat(lines.shift())

var qnt = (horas * vm) / 12
console.log(qnt.toFixed(3))