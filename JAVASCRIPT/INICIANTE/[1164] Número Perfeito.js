var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var n = lines.shift();
for(var i = 0; i < n; i++){
    var number = lines.shift();
    var sum = 0;
    for(var j = 1; j < number; j++){
        if(number % j == 0) sum += j
    }
    if(sum == number) var res = number + " eh perfeito"
    else var res = number + " nao eh perfeito"
    console.log(res)
}