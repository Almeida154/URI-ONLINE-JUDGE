var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

while(true){

    op = Number(lines.shift())
    if(op == 0) break

    var matriz = new Array()
    var auxVet = []
    var aux = 1

    for(var i = 1; i <= op; i++){
        for(var j = 1; j <= op; j++){
            aux = i;
            if(aux > j) aux = j;
            if(aux > op - i + 1) aux = op - i + 1;
            if(aux > op - j + 1) aux = op - j + 1;
            auxVet[j - 1] = aux;
        }
        matriz.push(auxVet)
        auxVet = []
    }
    
    for(var i = 0; i < op; i++){
        var linha = ""
        for(var j = 0; j < op; j++){
            if(j == 0) linha += "  " + matriz[i][j]
            else linha += ("   " + matriz[i][j])
        }
        console.log(linha)
    }
    console.log("")
}