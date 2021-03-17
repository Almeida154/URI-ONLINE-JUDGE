var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var n = Number(lines.shift())
var vet = []

for(var i = 0; i < n; i++){
    lineOne = lines[0].split(' ')
    var x = Number(lineOne[i])
    vet[i] = x
}

var me = 0
var pos = 0

for(var j = 0; j < vet.length; j++){
    if(vet[j] < me){
        me = vet[j]
        pos = j
    }
}

console.log(`Menor valor: ${me}`)
console.log(`Posicao: ${pos}`)