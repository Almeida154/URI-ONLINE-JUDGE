var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var readLine = lines[0].split(' ')
var n = parseInt(readLine[0])

for(var i = 1; i <= n; i++){
    var nLine = lines[i].split(' ')
    var x = Number(nLine[0])
    var y = Number(nLine[1])
    var soma = 0
    var cont = 0
    for(var j = x; true; j++){
        if(j % 2 != 0) {
            soma += j
            cont++
            if(cont == y) break
        }
    }
    console.log(soma)
}