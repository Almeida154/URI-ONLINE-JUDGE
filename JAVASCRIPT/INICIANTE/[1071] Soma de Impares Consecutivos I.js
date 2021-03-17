var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var x1 = parseInt(lines.shift())
var x2 = parseInt(lines.shift())
var sum = 0
if(x1 < x2) for(let i = x2 - 1; i > x1; i--) {if(i % 2 != 0) sum += i}
else for(let i = x1 - 1; i > x2; i--) {if(i % 2 != 0) sum += i}
console.log(sum)