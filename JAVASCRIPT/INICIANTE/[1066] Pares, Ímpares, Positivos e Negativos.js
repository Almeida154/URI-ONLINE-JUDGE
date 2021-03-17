var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var vetor = []
for(let i = 0; i < 5; i++) vetor[i] = Number(lines.shift())
var pares = 0
var impares = 0
var pos = 0
var neg = 0
for(let i = 0; i < 5; i++) {
    if(vetor[i] % 2 == 0) pares++
    if(vetor[i] % 2 != 0) impares++
    if(vetor[i] > 0) pos++
    if(vetor[i] < 0) neg++
}
console.log(`${pares} valor(es) par(es)`)
console.log(`${impares} valor(es) impar(es)`)
console.log(`${pos} valor(es) positivo(s)`)
console.log(`${neg} valor(es) negativo(s)`)