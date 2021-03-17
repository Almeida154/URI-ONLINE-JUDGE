var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

const cont = parseInt(lines.shift());

for(let i = 0; i < cont; i++) {
    const teste = lines.shift().split(' ');
    const numeros = lines.shift().split(' ').map(Number);
    const total = numeros.reduce((acc, current) => acc + current);
    const vencedor = teste.indexOf(total % 2 === 0 ? 'PAR' : 'IMPAR') - 1;
    console.log(teste[vencedor]);
}