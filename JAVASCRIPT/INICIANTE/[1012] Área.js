var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var linha1 = lines[0].split(' ')
    let a = parseFloat(linha1[0])
    let b = parseFloat(linha1[1])
    let c = parseFloat(linha1[2])

var tri = (a * c) / 2
var cir = 3.14159 * (c**2)
var tra = ((a + b) * c) / 2
var qua = b**2
var ret = a * b

console.log(`TRIANGULO: ${tri.toFixed(3)}`)
console.log(`CIRCULO: ${cir.toFixed(3)}`)
console.log(`TRAPEZIO: ${tra.toFixed(3)}`)
console.log(`QUADRADO: ${qua.toFixed(3)}`)
console.log(`RETANGULO: ${ret.toFixed(3)}`)