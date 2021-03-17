var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

function truncateDecimals(num, digits) {
    var numS = num.toString();
    var decPos = numS.indexOf('.');
    var substrLength = decPos == -1 ? numS.length : 1 + decPos + digits;
    var trimmedResult = numS.substr(0, substrLength);
    var finalResult = isNaN(trimmedResult) ? 0 : trimmedResult;

    if (decPos != -1){
        var s = trimmedResult+"";
        decPos = s.indexOf('.');
        var decLength = s.length - decPos;
            while (decLength <= digits){
                s = s + "0";
                decPos = s.indexOf('.');
                decLength = s.length - decPos;
                substrLength = decPos == -1 ? s.length : 1 + decPos + digits;
            };
        finalResult = s;
    }
    return finalResult;
}

var n = parseFloat(lines.shift())
var vet = [n]

for(var i = 1; i < 100; i++){
    vet[i] = (vet[i - 1]) / 2
}

for(var i = 0; i < 100; i++){
    if(vet[i] % 1 != 0.0 && vet[i].toFixed(4) > 0.0000){
        var decimais = (vet[i] % 1).toString().slice(6, 8)
        if(decimais.length == 1) decimais += 0
        if(parseInt(decimais) > 50) vet[i] += 0.0001
        console.log(`N[${i}] = ${truncateDecimals(vet[i], 4)}`)
    }else console.log(`N[${i}] = ${((vet[i]).toFixed(4))}`)
}

// it doesn't work :(