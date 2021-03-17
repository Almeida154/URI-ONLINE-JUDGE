var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

const shot = (raj, move01, move02, pos) => {
    if(raj == move01 || raj == move02) console.log(`Caso #${pos}: Bazinga!`);
	else console.log(`Caso #${pos}: Raj trapaceou!`);
}

var n = Number(lines.shift())

for(var i = 1; i <= n; i++){
    nextLine = lines.shift().split(' ')
    var sheldonOpc = nextLine[0]
    var rajOpc = nextLine[1]

    if(sheldonOpc == rajOpc) console.log(`Caso #${i}: De novo!`)
    else{
        if(sheldonOpc == 'tesoura') shot(rajOpc, 'papel', 'lagarto', i)
        if(sheldonOpc == 'papel') shot(rajOpc, 'pedra', 'Spock', i)
        if(sheldonOpc == 'pedra') shot(rajOpc, 'lagarto', 'tesoura', i)
        if(sheldonOpc == 'lagarto') shot(rajOpc, 'Spock', 'papel', i)
        if(sheldonOpc == 'Spock') shot(rajOpc, 'tesoura', 'pedra', i)
    }
}