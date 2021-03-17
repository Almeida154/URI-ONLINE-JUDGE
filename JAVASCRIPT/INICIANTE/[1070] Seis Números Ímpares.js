var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

x = Number(lines.shift())
for(let i = x; i <= x + 11; i++) if(i % 2 != 0) console.log(i)