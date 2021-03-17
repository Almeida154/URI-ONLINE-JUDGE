const { parse } = require('path');

var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

line = lines[0].split(' ');

var cards = []
cards[0] = line[0]
cards[1] = line[1]

if(parseInt(cards[0]) == parseInt(cards[1])) console.log(cards[0])
else {
    var ma = parseInt(cards[0]) > parseInt(cards[1]) ? cards[0] : cards[1]
    console.log(ma)
}