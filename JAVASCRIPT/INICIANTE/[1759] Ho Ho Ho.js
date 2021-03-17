var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var totHoHoHo = Number(lines.shift())
var result = 'Ho'

if(totHoHoHo > 1){
    for(var i = 2; i < totHoHoHo; i++){
        result += ' Ho'
    }
    console.log(result + ' Ho!')
}else console.log('Ho!')