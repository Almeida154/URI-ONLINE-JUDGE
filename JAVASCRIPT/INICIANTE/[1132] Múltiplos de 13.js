var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var soma = 0
var x = Number(lines.shift())
var y = Number(lines.shift())
if(x > y){
    var ma = x
    var me = y
}else{
    var ma = y
    var me = x
}
for(var i = me; i <= ma; i++){
    if(i % 13 != 0) soma += i
}
console.log(soma)