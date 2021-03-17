var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var n = Number(lines.shift());

for(var i = 0; i < n; i++){
    nextLine = lines[i].split(' ')
    var r1 = parseInt(nextLine[0])
    var r2 = parseInt(nextLine[1])
    console.log(r1 + r2)
}