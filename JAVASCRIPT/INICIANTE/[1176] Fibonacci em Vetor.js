var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var fib = n => {
    var n1 = 0
    var n2 = 1
    var vet = [0, 1]
    for(var i = 2; i <= n; i++){
        var n3 = n1 + n2
        n1 = n2
        n2 = n3
        vet[i] = n3
    }
    return vet[vet.length - 1]
}

var n = parseInt(lines.shift())
var cont = 0
while(cont < n){
    var x = parseInt(lines.shift())
    if(x == 0) console.log('Fib(0) = 0')
    else console.log(`Fib(${x}) = ${fib(x)}`)
    cont++
}