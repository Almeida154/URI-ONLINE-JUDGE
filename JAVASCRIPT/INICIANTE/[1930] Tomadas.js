var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

line = lines[0].split(' ');
var powers = []
for(var i = 0; i < 4; i++) powers[i] = parseInt(line[i])
console.log(powers[0] + powers[1] + powers[2] + powers[3] - 3)