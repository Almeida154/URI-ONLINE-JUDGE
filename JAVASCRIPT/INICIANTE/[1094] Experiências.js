var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var n = parseInt(linha1[0])

var coelhos = 0
var ratos = 0
var sapos = 0

for(let i = 1; i <= n; i++) {
    proxLinha = lines[i].split(' ')
        var qntd = parseInt(proxLinha[0])
        var bicho = proxLinha[1]
    switch(bicho){
        case 'C': coelhos += qntd; break;
        case 'R': ratos += qntd; break;
        case 'S': sapos += qntd; break;        
    }
}
var totBichos = coelhos + sapos + ratos
var avgCoelhos = (coelhos * 100) / totBichos
var avgRatos = (ratos * 100) / totBichos
var avgSapos = (sapos * 100) / totBichos
console.log(`Total: ${totBichos} cobaias`)
console.log(`Total de coelhos: ${coelhos}`)
console.log(`Total de ratos: ${ratos}`)
console.log(`Total de sapos: ${sapos}`)
console.log(`Percentual de coelhos: ${avgCoelhos.toFixed(2)} %`)
console.log(`Percentual de ratos: ${avgRatos.toFixed(2)} %`)
console.log(`Percentual de sapos: ${avgSapos.toFixed(2)} %`)