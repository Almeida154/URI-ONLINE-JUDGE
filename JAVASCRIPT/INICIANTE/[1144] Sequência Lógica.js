var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var i = 1;
var x = Number(lines.shift());
while(i <= x){
    var qua = i**2;
    var cub = i**3;
    console.log(i, qua, cub)
    console.log(i, qua+1, cub+1)
    i++;
}