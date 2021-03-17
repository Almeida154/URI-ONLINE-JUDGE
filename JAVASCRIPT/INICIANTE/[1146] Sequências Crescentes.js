var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var n = Number(lines.shift())
var string = ''

do{
    for(let i = 1; i <= n; i++){
        string  += i + ' '
    }
    console.log(string.slice(0, string.length - 1))
    n = Number(lines.shift())
    string = ''
}while(n != 0)