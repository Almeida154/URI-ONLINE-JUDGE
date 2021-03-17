var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var matriz = new Array()
var auxVet = []
var soma = 0

var op = lines.shift().toString()

for(var i = 0; i < 12; i++){
    for(var j = 0; j < 12; j++){
        auxVet[j] = Number(lines.shift())
    }
    matriz.push(auxVet)
    auxVet = []
}

for(let i = 0; i < 12; i++){
    for(let j = 0; j < 12; j++){
        if(j < (12 - i - 1)) soma += matriz[i][j]
    }
}

switch(op){
    case 'S':
        console.log(soma.toFixed(1))
        break
    case 'M':
        console.log((soma / 66).toFixed(1))
        break
}