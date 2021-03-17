var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var d = Number(lines.shift())
var t = (60 * d) / 30
console.log(`${t} minutos`)