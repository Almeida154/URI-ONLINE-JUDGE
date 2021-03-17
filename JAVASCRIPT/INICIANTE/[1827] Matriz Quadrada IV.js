var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

while(lines.length > 0){

    op = Number(lines.shift())
    var matriz = new Array()
    var auxVet = []
    var aux = op - 1

    for(var i = 0; i < op; i++){
        for(var j = 0; j < op; j++){
            if(j == i) auxVet[j] = 2
            if(j == aux) auxVet[j] = 3
            if(j != i && j != aux) auxVet[j] = 0
            if((i >= ((op / 3) - 1) && i <  op - (op / 3)) && (j >= ((op / 3) - 1) && j <  op - (op / 3))) auxVet[j] = 1
            if(i == (op - 1) / 2 && j == (op - 1) / 2) auxVet[j] = 4;
        }
        aux--
        matriz[i] = auxVet.join('')
        auxVet = []
    }
    console.log(`${matriz.join('\n')}`);
}