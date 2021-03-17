var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var hourIn = parseInt(linha1[0])
    var minIn = parseInt(linha1[1])
    var hourFi = parseInt(linha1[2])
    var minFi = parseInt(linha1[3])

if(hourIn == hourFi && minIn == minFi) {
    console.log(`O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)`);
    return
}
if(hourIn >= hourFi) var horas = 24 - (hourIn - hourFi)
else var horas = hourFi - hourIn
if(minIn >= minFi) {
    var minutos = 60 - (minIn - minFi)
    horas--
} else var minutos = minFi - minIn

if(horas == 24){
    horas = 0
}

else if(minutos == 60){
    minutos = 0
    horas++
}
console.log(`O JOGO DUROU ${horas} HORA(S) E ${minutos} MINUTO(S)`);