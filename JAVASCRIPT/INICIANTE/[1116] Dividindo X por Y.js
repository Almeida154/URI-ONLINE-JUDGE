var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var n = Number(lines.shift())
for(var i = 0; i < n; i++){
    nLine = lines[i].split(' ')
    var x = Number(nLine[0])
    var y = Number(nLine[1])
    if(y == 0) console.log('divisao impossivel')
    else{
        var res = x / y
        console.log(res.toFixed(1))
    }
}