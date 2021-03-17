var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var senha = parseInt(lines.shift())

while(senha != 2002){
    var senha = parseInt(lines.shift())
    console.log("Senha Invalida")
}

console.log("Acesso Permitido")