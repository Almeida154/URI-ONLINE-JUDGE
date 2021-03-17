var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var qntd = 1, winsGremio = 0, winsInter = 0, ties = 0
for(var i = 0, j = 1; true; i += 2, j += 2, ++qntd){
    var nLine = lines[i].split(' ')
    var nOpc = lines[j].split(' ')
    var gInter = parseInt(nLine[0])
    var gGremio = parseInt(nLine[1])
    if(gGremio > gInter) winsGremio++
    else if(gInter > gGremio) winsInter++
    else ties++
    console.log('Novo grenal (1-sim 2-nao)')
    var opc = parseInt(nOpc[0])
    if(opc != 1){
        console.log(`${qntd} grenais`)
        console.log(`Inter:${winsInter}`)
        console.log(`Gremio:${winsGremio}`)
        console.log(`Empates:${ties}`)
        if(winsGremio > winsInter) console.log('Gremio venceu mais')
        else if(winsInter > winsGremio) console.log('Inter venceu mais')
        else console.log('Nao houve vencedor')
        break
    }
}