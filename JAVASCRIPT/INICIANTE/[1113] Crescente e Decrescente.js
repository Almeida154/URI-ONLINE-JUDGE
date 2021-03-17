var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var linha1 = lines[0].split(' ')
    var n1 =  Number(linha1[0])
    var n2 = Number(linha1[1])
for(let i = 0 ;n1 != n2; i++){
    var nextLine = lines[i].split(' ')
    var n1 = Number(nextLine[0])
    var n2 = Number(nextLine[1])
    if(n1 > n2) console.log('Decrescente')
    else if(n2 > n1) console.log('Crescente')
}