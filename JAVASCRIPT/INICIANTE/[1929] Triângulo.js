var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var verifyTriangle = (sticks) => {
    if(sticks[0] + sticks[1] > sticks[2] && sticks[0] + sticks[2] > sticks[1] && sticks[1] + sticks[2] > sticks[0]
    || sticks[1] + sticks[2] > sticks[3] && sticks[1] + sticks[3] > sticks[2] && sticks[2] + sticks[3] > sticks[1]
    || sticks[2] + sticks[3] > sticks[0] && sticks[2] + sticks[0] > sticks[3] && sticks[3] + sticks[0] > sticks[2]
    || sticks[3] + sticks[0] > sticks[1] && sticks[3] + sticks[1] > sticks[0] && sticks[0] + sticks[1] > sticks[3])
        return true;
    else return false;
}

line = lines[0].split(' ');
var sticks = []
for(var i = 0; i < 4; i++) sticks[i] = parseInt(line[i])
var answer = verifyTriangle(sticks) ? "S" : "N";
console.log(answer)