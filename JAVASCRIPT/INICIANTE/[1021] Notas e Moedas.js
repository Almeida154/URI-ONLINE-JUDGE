var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var moneyN = parseFloat(lines.shift())
var moneyM = moneyN * 100

//Notas
let n100 = moneyN / 100; moneyN %= 100
let n50 = moneyN / 50; moneyN %= 50
let n20 = moneyN / 20; moneyN %= 20
let n10 = moneyN / 10; moneyN %= 10
let n5 = moneyN / 5; moneyN %= 5
let n2 = moneyN / 2; moneyN %= 2

moneyM %= 100

//Moedas
let m1_00 = moneyN / 1; moneyN %= 1
let m0_50 = moneyM / 50; moneyM %= 50
let m0_25 = moneyM / 25; moneyM %= 25
let m0_10 = moneyM / 10; moneyM %= 10
let m0_05 = moneyM / 5; moneyM %= 5
let m0_01 = moneyM


console.log("NOTAS:")
console.log(`${parseInt(n100)} nota(s) de R$ 100.00`)
console.log(`${parseInt(n50)} nota(s) de R$ 50.00`)
console.log(`${parseInt(n20)} nota(s) de R$ 20.00`)
console.log(`${parseInt(n10)} nota(s) de R$ 10.00`)
console.log(`${parseInt(n5)} nota(s) de R$ 5.00`)
console.log(`${parseInt(n2)} nota(s) de R$ 2.00`)

console.log("MOEDAS:")
console.log(`${parseInt(m1_00)} moeda(s) de R$ 1.00`)
console.log(`${parseInt(m0_50)} moeda(s) de R$ 0.50`)
console.log(`${parseInt(m0_25)} moeda(s) de R$ 0.25`)
console.log(`${parseInt(m0_10)} moeda(s) de R$ 0.10`)
console.log(`${parseInt(m0_05)} moeda(s) de R$ 0.05`)
console.log(`${parseInt(m0_01)} moeda(s) de R$ 0.01`)