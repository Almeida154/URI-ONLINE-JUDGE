var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var vet = []

for(var i = 0; i < 20; i++){
    vet[i] = lines.shift();
}

for(var i = 0; i < 10; i++){
    var ult = vet[(vet.length - 1) - i]
    var fs = vet[i]
    vet[i] = ult
    vet[(vet.length - 1) - i] = fs
}

for(var i = 0; i < 20; i++){
    console.log(`N[${i}] = ${vet[i]}`)
}