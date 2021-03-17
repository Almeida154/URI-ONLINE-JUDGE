var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var n = parseInt(lines.shift())
var aux = n / 100
console.log(n)
console.log(`${parseInt(aux)} nota(s) de R$ 100,00`)
aux = n % 100
console.log(`${parseInt(aux / 50)} nota(s) de R$ 50,00`)
aux %= 50
console.log(`${parseInt(aux / 20)} nota(s) de R$ 20,00`)
aux %= 20
console.log(`${parseInt(aux / 10)} nota(s) de R$ 10,00`)
aux %= 10
console.log(`${parseInt(aux / 5)} nota(s) de R$ 5,00`)
aux %= 5
console.log(`${parseInt(aux / 2)} nota(s) de R$ 2,00`)
aux %= 2
console.log(`${parseInt(aux / 1)} nota(s) de R$ 1,00`)