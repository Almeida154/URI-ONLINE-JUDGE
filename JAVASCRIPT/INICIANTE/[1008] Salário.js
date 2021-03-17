var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var nf = parseInt(lines.shift())
var horast = parseInt(lines.shift())
var sal = parseFloat(lines.shift())
console.log(`NUMBER = ${nf}`)
console.log(`SALARY = U$ ${(sal * horast).toFixed(2)}`)