var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var id = Number(lines.shift())
var years = parseInt(id / 365)
id %= 365
var months = parseInt(id / 30)
id %= 30
var days = parseInt(id/1)
console.log(`${years} ano(s)`)
console.log(`${months} mes(es)`)
console.log(`${days} dia(s)`)