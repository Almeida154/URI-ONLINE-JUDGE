var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    let a = parseInt(linha1[0])
    let b = parseInt(linha1[1])

if(a % b == 0 || b % a == 0)
    console.log("Sao Multiplos")

else console.log('Nao sao Multiplos')