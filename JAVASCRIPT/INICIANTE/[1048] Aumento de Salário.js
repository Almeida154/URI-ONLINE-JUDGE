var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var salário = Number(lines.shift())
var reajuste

if(salário <= 400) reajuste = 15
else if(salário <= 800) reajuste = 12
else if(salário <=1200) reajuste = 10
else if(salário <= 2000) reajuste = 7
else reajuste = 4

var aumento = (salário / 100) * reajuste
var novoSalário = salário + aumento

console.log(`Novo salario: ${novoSalário.toFixed(2)}`)
console.log(`Reajuste ganho: ${aumento.toFixed(2)}`)
console.log(`Em percentual: ${reajuste} %`)