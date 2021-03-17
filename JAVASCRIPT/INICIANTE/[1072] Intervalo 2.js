var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var x = parseInt(lines.shift())
var vetor = []
for(let i = 0; i < x; i++) vetor[i] = Number(lines.shift())
var _in_ = 0
var _out_ = 0
for(let i = 0; i < x; i++){
    if(vetor[i] >= 10 && vetor[i] <= 20) _in_++
    else _out_++
}
console.log(_in_ + ' in')
console.log(_out_ + ' out')