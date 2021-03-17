var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var cod = Number(linha1[0])
    var qntd = Number(linha1[1])

if(cod == 1) console.log(`Total: R$ ${(qntd * 4).toFixed(2)}`)
if(cod == 2) console.log(`Total: R$ ${(qntd * 4.5).toFixed(2)}`)
if(cod == 3) console.log(`Total: R$ ${(qntd * 5).toFixed(2)}`)
if(cod == 4) console.log(`Total: R$ ${(qntd * 2).toFixed(2)}`)
if(cod == 5) console.log(`Total: R$ ${(qntd * 1.5).toFixed(2)}`)