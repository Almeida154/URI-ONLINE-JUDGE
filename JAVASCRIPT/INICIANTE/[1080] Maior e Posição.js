var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var vetor = []
for(let i = 0; i < 100; i++){
    var n = Number(lines.shift())
    vetor[i] = n
}
let ma = vetor[0]
let pos = 1
for(let i = 1; i < 100; i++){
    if(vetor[i] > ma) {
        ma = vetor[i]
        pos = i + 1
    }
}
console.log(ma)
console.log(pos)