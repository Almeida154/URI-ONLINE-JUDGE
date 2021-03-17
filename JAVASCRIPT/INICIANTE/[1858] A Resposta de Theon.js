var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')


for(var aux = -1; ; aux++){

    nLine = lines[aux + 1].split(' ');
    nLineDif = lines[aux + 2].split(' ');

    var j = nLine[0]
    var vet = []
    vet[0] = nLineDif[0]
    var mePos = 0
    var me = vet[0]

    for(var i = 1; i < j; i++){
        vet[i] = [nLineDif[i]]
        if(vet[i] < me) {
            me = vet[i]
            mePos = i
        }
    }

    console.log(mePos + 1)

}