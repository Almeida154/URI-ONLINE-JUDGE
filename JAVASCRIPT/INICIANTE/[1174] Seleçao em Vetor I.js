var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var vet = []
for(var i = 0; i < 100; i++) vet[i] = lines.shift()
for(var i = 0; i < vet.length; i++) {
    if(vet[i] <= 10) console.log(`A[${i}] = ${parseFloat(vet[i]).toFixed(1)}`)
}