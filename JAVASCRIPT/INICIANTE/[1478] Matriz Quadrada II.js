var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

while(true){

    op = Number(lines.shift())
    if(op == 0) break

    var matriz = new Array()
    var auxVet = []
    var aux = 2

    for(var i = 0; i < op; i++){
        var dBigger = 1
        var dSmaller = aux
        for(var j = 0; j < op; j++){
            if(j > i) auxVet[j] = ` ${++dBigger}`
            if(j < i) auxVet[j] = ` ${--dSmaller}`
            if(j == i) auxVet[j] = ` ${1}`
        }
        aux++
        matriz[i] = ` ${auxVet.join('  ')}`;
        auxVet = []
    }
    console.log(`${matriz.join('\n')}`);
    console.log('')
}