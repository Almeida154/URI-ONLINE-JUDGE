var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var pum = 0, n1 = 1, n2 = 3, string = ''
var x = Number(lines.shift())
while(true){
    if(pum == x) break
    for(var i = n1; i <= n2; i++){
        string += i + " "
    }
    string += 'PUM'
    console.log(string)
    string = ''
    pum++
    n1 += 4, n2+=4
}