var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var x = parseInt(lines.shift())
for(var i = 0; i <= x; i++) var divisorPerfeito = (x % i == 0) ? console.log(i) : function(){}  
