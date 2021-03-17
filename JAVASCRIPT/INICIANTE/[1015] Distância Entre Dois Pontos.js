var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var linha1 = lines[0].split(' ')
    var x1 = Number(linha1[0])
    var y1 = Number(linha1[1])

var linha2 = lines[1].split(' ')
    var x2 = Number(linha2[0])
    var y2 = Number(linha2[1])

var dis = ((x2 - x1)**2) + ((y2 - y1)**2)
console.log(Math.sqrt(dis).toFixed(4))