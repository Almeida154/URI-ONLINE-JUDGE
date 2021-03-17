var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var s = Number(lines.shift())
var i = 0
var aux

if (s > 4500) {
    i = (1000 * 8 / 100) + (1500 * 18 / 100)
    aux = s - 4500
    i += (aux * 28 / 100)
}

else if (s > 3000) {
    i = 1000 * 8 / 100
    aux = s - 3000
    i += (aux * 18 / 100)
}

else if (s > 2000) {
    aux = s - 2000
    i += (aux * 8 / 100)
}

//---------------------------------//
if (i > 0) console.log(`R$ ${i.toFixed(2)}`)
else console.log('Isento')
//---------------------------------//