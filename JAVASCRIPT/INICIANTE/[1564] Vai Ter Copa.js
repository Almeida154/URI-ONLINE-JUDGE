var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

while(lines.length > 0){
    op = parseInt(lines.shift())
    if(op > 0) console.log('vai ter duas!')
    else console.log('vai ter copa!')
}