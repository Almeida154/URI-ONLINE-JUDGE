var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

line = lines[0].split(' ')
var a = parseInt(line[0])
var b = parseInt(line[1])
var q, r;

if(a >= 0){
    q = a / b
    r = a % b
}else{
    var x = b, y = 0
    if(b < 0) x = b * -1
    for(r = 0; r < x; r++){
        y = a - r
        if(y % b == 0) break
    }
    (q = y / b)
}

console.log(`${parseInt(q)} ${parseInt(r)}`)