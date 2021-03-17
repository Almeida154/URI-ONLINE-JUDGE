var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

let mês = parseInt(lines.shift())
var nomeMês

switch(mês){
    case 1:
        nomeMês = 'January'
        break
    case 2:
        nomeMês = 'February'
        break
    case 3:
        nomeMês = 'March'
        break
    case 4:
        nomeMês = 'April'
        break
    case 5:
        nomeMês = 'May'
        break
    case 6:
        nomeMês = 'June'
        break
    case 7:
        nomeMês = 'July'
        break
    case 8:
        nomeMês = 'August'
        break
    case 9:
        nomeMês = 'September'
        break
    case 10:
        nomeMês = 'October'
        break
    case 11:
        nomeMês = 'November'
        break
    case 12:
        nomeMês = 'December'
        break
}

console.log(nomeMês)