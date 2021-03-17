var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var linha1 = lines[0].split(' ')
    var n1 = Number(linha1[0])
    var n2 = Number(linha1[1])
for(let i = 0; n1 > 0 && n2 > 0; i++){
    var sum = 0
    var string = ""
    var nextL = lines[i].split(' ')
        n1 = Number(nextL[0])
        n2 = Number(nextL[1])
    if(n1 < 1 || n2 < 1) break
    else if(n1 > n2){
        for(let i = n2; i <= n1; i++){
            sum += i
            string += !string.length ? i : " " + i
        }
    } else if(n2 > n1){
        for(let i = n1; i <= n2; i++){
            sum += i
            string += !string.length ? i : " " + i
        }
    } else if (n1 == n2){
        sum = n1
        string += n1.toString()
    }
    console.log(string + " Sum=" + sum)
}