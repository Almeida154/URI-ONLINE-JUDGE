var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    let a = Number(linha1[0])
    let b = Number(linha1[1])
    let c = Number(linha1[2])

var delta = (b**2) - 4 * a * c
if(a == 0 || delta < 0) console.log('Impossivel calcular')
else{
    var x1 = ((-b) + Math.sqrt(delta)) / (2 * a)
    var x2 = ((-b) - Math.sqrt(delta)) / (2 * a)

    console.log(`R1 = ${x1.toFixed(5)}`)
    console.log(`R2 = ${x2.toFixed(5)}`)
} 