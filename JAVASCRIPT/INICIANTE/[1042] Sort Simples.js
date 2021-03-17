var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var a = Number(linha1[0])
    var b = Number(linha1[1])
    var c = Number(linha1[2])

    var DES = [a, b, c]

if (a < b && b < c) var ORD = [a, b, c]
else if(a < c && c < b) var ORD = [a, c, b]
else if(b < a && a < c) var ORD = [b, a, c]
else if(b < c && c < a) var ORD = [b, c, a]
else if(c < a && a < b) var ORD = [c, a, b]
else if(c < b && b < a) var ORD = [c, b, a]

for(var i = 0; i < 3; i++) console.log(ORD[i])
console.log('')
for(var i = 0; i < 3; i++) console.log(DES[i])

