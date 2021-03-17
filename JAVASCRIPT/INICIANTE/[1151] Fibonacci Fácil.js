var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var fib = n => {
    var n1 = 0
    var n2 = 1
    var string = '0 1 '
    for(var i = 1; i <= (n - 2); i++){
        var n3 = n1 + n2
        n1 = n2
        n2 = n3
        string += n3 + ' '
    }
    return string
}

var x = parseInt(lines.shift())
var testar = x < 2 ? console.log(0) : console.log(fib(x).slice(0, fib(x).length - 1))