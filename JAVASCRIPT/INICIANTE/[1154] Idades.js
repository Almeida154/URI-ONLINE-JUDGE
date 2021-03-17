var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var x = parseInt(lines.shift())
var contador = 0
var soma = 0
while(x > 0){
    contador++
    soma += x
    var x = parseInt(lines.shift())
}
console.log(`${(soma / contador).toFixed(2)}`)