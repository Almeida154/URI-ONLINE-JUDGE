var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    let a = Number(linha1[0])
    let b = Number(linha1[1])
    let c = Number(linha1[2])
    let d = Number(linha1[3])

if(b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a%2==0) console.log('Valores aceitos')
else console.log('Valores nao aceitos')