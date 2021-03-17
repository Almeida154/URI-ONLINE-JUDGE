var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var pos = lines.shift()
var s = "LIFE IS NOT A PROBLEM TO BE SOLVED"
console.log(`${s.substring(0, pos)}`)