var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var x = parseInt(lines.shift())
var fat = 1

for(var i = x; i > 0; i--){
    fat *= i
}

console.log(fat)