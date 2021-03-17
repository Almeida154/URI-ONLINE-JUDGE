var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var vet = []
for(var i = 0; i < 10; i++) vet[i] = lines.shift()
for(var i = 0; i < vet.length; i++) {
    if(vet[i] < 1) vet[i] = 1
    console.log(`X[${i}] = ${vet[i]}`)
}