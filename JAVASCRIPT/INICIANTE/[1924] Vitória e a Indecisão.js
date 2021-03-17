var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var n = lines.shift()
for(var i = 0; i < n; i++) var fds = lines.shift()
console.log('Ciencia da Computacao')