var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var nLine = lines[0].split(' ')
var a = Number(nLine[0])
var soma = 0
for(var i = 1; true; i++){
    var n = Number(nLine[i])
    if(n > 0){
        for(let i = 0; i < n; i++){
            soma += a
            a++
        }
        break
    }
}
console.log(soma)