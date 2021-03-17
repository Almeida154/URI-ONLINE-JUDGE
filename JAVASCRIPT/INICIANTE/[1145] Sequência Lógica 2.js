var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var readLine = lines[0].split(' ')
    var x = parseInt(readLine[0])
    var y = parseInt(readLine[1])

var string = ''

for(var j = 1, i = 1; i <= y; j++, i++){
    string += i + ' '
    if(j % x == 0){
        string = string.slice(0, (string.length - 1))
        console.log(string)
        string = ''
    }
}
if(string != ''){
    string = string.slice(0, (string.length - 1))
    console.log(string)
}