var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var aux = 0
var sum = 0
for(var i = 0; true; i++){
    var nota = Number(lines.shift())
    if(aux > 1) break
    else if(nota < 0 || nota > 10) console.log('nota invalida')
    else{
        aux++
        sum += nota
    }
}
console.log(`media = ${(sum / 2).toFixed(2)}`)