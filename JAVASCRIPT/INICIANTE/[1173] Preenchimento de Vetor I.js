var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var vet = []
vet[0] = lines.shift()
for(var i = 1; i < 10; i++) {
    vet[i] = (vet[i - 1] * 2)
}
for(var i = 0; i < vet.length; i++) console.log(`N[${i}] = ${vet[i]}`)