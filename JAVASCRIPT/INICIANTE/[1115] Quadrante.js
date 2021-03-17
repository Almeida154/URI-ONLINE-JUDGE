var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var firstL = lines[0].split(' ')
    var x = parseInt(firstL[0])
    var y = parseInt(firstL[1])
    sera(x, y)

for(var i = 1 ; x != 0 && y != 0; i++){
    var nLine = lines[i].split(' ')
        var x = parseInt(nLine[0])
        var y = parseInt(nLine[1])
        sera(x, y)
}

function sera(x, y){
    if(x > 0 && y > 0) console.log('primeiro')
    else if(x < 0 && y > 0) console.log('segundo')
    else if(x < 0 && y < 0) console.log('terceiro')
    else if(x > 0 && y < 0) console.log('quarto')
}