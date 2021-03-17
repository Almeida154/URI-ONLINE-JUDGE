var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var n = 3.14159
var raio = Number(lines.shift())
var área = n * (raio * raio)
console.log(`A=${área.toFixed(4)}`)