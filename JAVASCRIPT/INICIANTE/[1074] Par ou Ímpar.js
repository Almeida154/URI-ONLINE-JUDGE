var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var n = parseInt(lines.shift())
for(let i = 1; i < 10001; i++){
    if(i % n == 2) console.log(i)
}