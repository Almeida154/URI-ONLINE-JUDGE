var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var par = []
var impar = []

var pares = 0
var impares = 0

for(var i = 0; i < 15; i++){

    var number = Number(lines.shift())

    if(number % 2 == 0){
        par[pares] = number
        pares++
    }else{
        impar[impares] = number
        impares++
    }

    if(pares == 5){
        for(let j = 0; j < par.length; j++) console.log(`par[${j}] = ${par[j]}`)
        par = []
        pares = 0
    }

    if(impares == 5){
        for(let j = 0; j < impar.length; j++) console.log(`impar[${j}] = ${impar[j]}`)
        impar = []
        impares = 0
    }

}

for(let j = 0; j < impar.length; j++) console.log(`impar[${j}] = ${impar[j]}`)
for(let j = 0; j < par.length; j++) console.log(`par[${j}] = ${par[j]}`)