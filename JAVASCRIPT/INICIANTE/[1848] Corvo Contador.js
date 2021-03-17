var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var sum = 0
var i = 0

for(var j = 0; true; j++){
    nLine = lines[j].split(' ')
    s = nLine[0]
    if(s == 'caw') {
        console.log(sum)
        i++
        if(i == 3) break
        sum = 0
    }else{
        if(s == '--*') sum += 1
        else if(s == '-*-') sum += 2
        else if(s == '-**') sum += 3
        else if(s == '*--') sum += 4
        else if(s == '*-*') sum += 5
        else if(s == '**-') sum += 6
        else if(s == '***') sum += 7
        else sum += 8
    }
}