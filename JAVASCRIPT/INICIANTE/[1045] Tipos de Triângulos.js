var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    var a = parseFloat(linha1[0])
    var b = parseFloat(linha1[1])
    var c = parseFloat(linha1[2])
    
var A = Math.max(a, Math.max(b, c))

if (A == a) {
    var B = Math.max(b, c);
    var C = Math.min(b, c);
}
if (A == b) {
    var B = Math.max(a, c);
    var C = Math.min(a, c);
}
if (A == c) {
    var B = Math.max(b, a);
    var C = Math.min(b, a);
}

if(A >= B + C) {
    console.log("NAO FORMA TRIANGULO") 
    return
}

if(A**2 == B**2 + C**2) console.log("TRIANGULO RETANGULO")
if(A**2 > B**2 + C**2) console.log("TRIANGULO OBTUSANGULO")
if(A**2 < B**2 + C**2) console.log("TRIANGULO ACUTANGULO")
if(A == B && B == C) console.log("TRIANGULO EQUILATERO")
if(A == B && B != C || A ==  C && A != B || B == C && B != A) console.log("TRIANGULO ISOSCELES")