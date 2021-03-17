var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

for(var i = 0; true; i++){

    nextLine = lines[i].split(' ')
    var n1 = nextLine[0];
    if(n1 == 0) break
    var n2 = nextLine[1];
    var percent = nextLine[2];

    var houseSize = n1 * n2;
    var ground = (houseSize * 100) / percent;

    console.log(parseInt(Math.sqrt(ground)))

}