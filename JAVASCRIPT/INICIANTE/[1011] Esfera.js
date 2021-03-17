var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var pi =  3.14159
var div = 4/3
var raio = Number(lines.shift())
var esfera = div * pi * (raio**3)
console.log(`VOLUME = ${esfera.toFixed(3)}`)