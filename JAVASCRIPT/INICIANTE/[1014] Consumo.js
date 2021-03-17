var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

let x = Number(lines.shift())
let y = Number(lines.shift())
var consumo = x / y
console.log(`${consumo.toFixed(3)} km/l`)