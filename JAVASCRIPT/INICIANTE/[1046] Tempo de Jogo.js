var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var hi = parseInt(linha1[0])
    var hf = parseInt(linha1[1])

if(hi >= hf){
    var horaPart1 = 24 - hi
    var horaPart2 = horaPart1 + hf
}
else{
    var horaPart2 = hf - hi
}

console.log(`O JOGO DUROU ${horaPart2} HORA(S)`)
