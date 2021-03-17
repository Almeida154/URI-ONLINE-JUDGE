var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var diaSTART = parseInt(linha1[1])

linha2 = lines[1].split(' ')
    var horaSTART = parseInt(linha2[0])
    var minutoSTART = parseInt(linha2[2])
    var segundoSTART = parseInt(linha2[4])

linha3 = lines[2].split(' ')
    var diaEND = parseInt(linha3[1])

linha4 = lines[3].split(' ')
    var horaEND = parseInt(linha4[0])
    var minutoEND = parseInt(linha4[2])
    var segundoEND = parseInt(linha4[4])

var dias = diaEND - diaSTART
var horas = horaEND - horaSTART
var minutos = minutoEND - minutoSTART
var segundos = segundoEND - segundoSTART

var segund = 0
var aux

segund += dias * 86400
segund += horas * 3600
segund += minutos * 60
segund += segundos

console.log(`${Math.trunc(segund / 86400)} dia(s)`)
aux = segund % 86400
console.log(`${Math.trunc(aux / 3600)} hora(s)`)
aux = segund % 3600
console.log(`${Math.trunc(aux / 60)} minuto(s)`)
aux = segund % 60
console.log(`${Math.trunc(aux)} segundo(s)`)