var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var vetor = []
for(let i = 0; i < 5; i++) vetor[i] = Number(lines.shift())
var sum = 0
for(let i = 0; i < 5; i++) if(vetor[i] % 2 == 0) sum++
console.log(`${sum} valores pares`)