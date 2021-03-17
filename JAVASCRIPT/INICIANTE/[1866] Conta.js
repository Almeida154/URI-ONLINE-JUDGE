var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var n = lines.shift()
		
for(var i = 0; i < n; i++) {
    var x = lines.shift();
    x = x % 2 == 0 ? 0 : 1;
    console.log(x);
}