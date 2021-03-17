var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var t = parseInt(lines.shift())

var h = parseInt(t / 3600)
var aux = t % 3600 
var m = parseInt(aux / 60)
aux %= 60
var s = parseInt(aux / 1)
console.log(`${h}:${m}:${s}`)