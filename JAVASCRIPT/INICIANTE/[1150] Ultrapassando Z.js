var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var x = parseInt(lines.shift())
var z = parseInt(lines.shift())

while(z <= x){
    var z = parseInt(lines.shift())
}

var j = x < 0 ? j = 0 : j = 1 

var soma = x
for(var i = soma;  soma <= z; i++){
    soma +=  i
    j++
}
console.log(j)
