var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var vet = []
var n = parseInt(lines.shift())

for(var i = 0, j = 0; i < 1000; i++, j++){
    if(j == n) j = 0
    vet[i] = j
}

for(var i = 0; i < 1000; i++) console.log(`N[${i}] = ${vet[i]}`)