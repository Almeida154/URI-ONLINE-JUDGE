var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')
var x = Number(lines.shift())
var y = Number(lines.shift())
if(x > y){
    var ma = x
    var me = y
}else{
    var ma = y
    var me = x
}
for(var i = (me + 1); i < ma; i++){
    if(i % 5 == 2 || i % 5 == 3) console.log(i)
}