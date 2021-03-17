var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var firstLine = lines[0].split(' ')
    var x = Number(firstLine[0])
for(var i = 1; i <= x; i++){
    var nLine = lines[i].split(' ')
        var pa = Number(nLine[0])
        var pb = Number(nLine[1])
        var g1 = Number(nLine[2])
        var g2 = Number(nLine[3])
    var cont = 0
    while(pa <= pb){
        pa += Math.trunc(pa * (g1 / 100.0))
        pb += Math.trunc(pb * (g2 / 100.0))
        cont++
        if(cont > 100) break
    }
    if(cont > 100) console.log('Mais de 1 seculo.')
    else console.log(`${cont} anos.`)
}