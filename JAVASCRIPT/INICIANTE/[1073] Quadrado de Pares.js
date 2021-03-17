var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var x = parseInt(lines.shift())
for(let i = 2; i <= x; i++) if(i % 2 == 0) console.log(`${i}^2 = ${i**2}`)