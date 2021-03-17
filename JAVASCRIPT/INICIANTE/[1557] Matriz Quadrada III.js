var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

while(true){
    op = Number(lines.shift())
    if(op == 0) break

    var matrix = new Array()
    var auxVet = []
    var doub = 1
    var biggerNumber = 1

    for(var i = 0; i < op; i++){
        var aux = doub
        for(var j = 0; j < op; j++){
            auxVet[j] = aux
            aux *= 2
        }
        doub *= 2
        matrix[i] = ` ${auxVet.join('  ')}`
        auxVet = []
    }
    console.log(`${matrix.join('\n')}`);
    console.log('')
}