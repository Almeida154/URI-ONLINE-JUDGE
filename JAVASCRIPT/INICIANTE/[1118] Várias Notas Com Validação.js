var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var aux = 0
var sum = 0
while(true){
    var media=0;
    var t=0;
    for(var k = 0; k!= 2;){
        var n = Number(lines.shift())
        if(n <= 10 && n >= 0){
            t+=n
            k++
        }
        else console.log('nota invalida')
    }
    media = t / 2
    console.log(`media = ${media.toFixed(2)}`)
    while(true){
        console.log('novo calculo (1-sim 2-nao)')
        var x = Number(lines.shift())
        if(x == 1 || x == 2) break
    }
    if(x == 2) break;
}