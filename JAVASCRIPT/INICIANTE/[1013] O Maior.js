var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var linha1 = lines[0].split(' ')
    var a = Number(linha1[0])
    var b = Number(linha1[1])
    var c = Number(linha1[2])

var maior

if (a > b && a > c) maior = a
else if (b > c) maior = b
else maior = c

console.log(`${maior} eh o maior`)