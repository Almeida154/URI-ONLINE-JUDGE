var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var alcool = 0, gasosa = 0, vandiesel = 0, verifour = 0
while(true){
    while(true){
        var n = Number(lines.shift())
        if(n == 1) alcool++
        else if(n == 2) gasosa++
        else if(n == 3) vandiesel++
        else if(n == 4) {
            verifour++
            break
        }
        else break
    }
    if(verifour == 1) break
}
console.log('MUITO OBRIGADO')
console.log(`Alcool: ${alcool}`)
console.log(`Gasolina: ${gasosa}`)
console.log(`Diesel: ${vandiesel}`)