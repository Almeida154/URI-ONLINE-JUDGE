var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var linha1 = lines[0].split(' ')
    var c1 = linha1[0]
    var n1 = parseInt(linha1[1])
    var price1 = parseFloat(linha1[2])

var linha2 = lines[1].split(' ')
    var c1 = linha2[0]
    var n2 = parseInt(linha2[1])
    var price2 = parseFloat(linha2[2])

var res = n1 * price1 + n2 * price2

console.log( `VALOR A PAGAR: R$ ${res.toFixed(2)}` )