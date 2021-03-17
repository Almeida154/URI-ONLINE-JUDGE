var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var a = Number(linha1[0]);
    var b = Number(linha1[1]);
    var c = Number(linha1[2]);

if(a < (b + c) && b < (a + c) && c < (b + a)){
    var pTri = a + b + c
    console.log(`Perimetro = ${pTri.toFixed(1)}`)
}

else {
    var aTra = ((a + b) / 2) * c
    console.log(`Area = ${aTra.toFixed(1)}`)
}