var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

while(x != 0){
    var sum = 0
    var cont = 0
    var x = parseInt(lines.shift())
    if(x == 0) break
    for(var i = x; true; i++){
        if(i % 2 == 0) {
            sum += i
            cont++
            if(cont == 5) break
        }
    }
    console.log(sum)
}
