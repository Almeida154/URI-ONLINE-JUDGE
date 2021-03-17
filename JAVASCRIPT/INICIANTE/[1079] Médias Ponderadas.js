var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var n = parseInt(linha1[0])

for(let i = 1; i < (n + 1); i++){
    proxLinha = lines[i].split(' ')
        var n1 = Number(proxLinha[0])
        var n2 = Number(proxLinha[1])
        var n3 = Number(proxLinha[2])
    var avg = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10
    console.log(avg.toFixed(1))
}