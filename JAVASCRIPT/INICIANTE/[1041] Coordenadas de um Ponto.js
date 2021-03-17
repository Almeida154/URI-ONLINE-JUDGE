var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var x = Number(linha1[0])
    var y = Number(linha1[1])

if(x == 0 && y == 0) console.log('Origem')
else if(x > 0 && y > 0) console.log('Q1')
else if(x < 0 && y > 0) console.log('Q2')
else if(x < 0 && y < 0) console.log('Q3')
else if(x > 0 && y < 0) console.log('Q4')
else if(x == 0) console.log('Eixo Y')
else if(y == 0) console.log('Eixo X')