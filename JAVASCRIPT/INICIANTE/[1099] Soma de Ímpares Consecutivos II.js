var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var n = parseInt(linha1[0])

for(let i = 1; i < (n + 1); i++){
    nLine = lines[i].split(' ')
    var n1 = Number(nLine[0])
    var n2 = Number(nLine[1])
    var sumImpar = 0
    if(n1 > n2){
        for(let i = (n2 + 1); i < n1; i++){
            if(i % 2 != 0) sumImpar += i
        }
    }else if(n2 > n1){
        for(let i = (n1 + 1); i < n2; i++){
            if(i % 2 != 0) sumImpar += i
        }
    }else if(n2 == n1){
        sumImpar = 0
    }
    console.log(sumImpar)
}