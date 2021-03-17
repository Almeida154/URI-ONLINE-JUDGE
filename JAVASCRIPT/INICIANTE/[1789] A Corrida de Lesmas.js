var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

for(var i = 0; true; i += 2){

    if(lines[i] != null) nLine = lines[i].split(' ')
    else break

    nLineSlugs = lines[i + 1].split(' ')

    var n = parseInt(nLine[0])
    var major = 0
    var res = 0

    for(var slug = 0; slug < n; slug++){
        var currentSlug = parseInt(nLineSlugs[slug])
        major = currentSlug > major ? currentSlug : major
    }

    if(major < 10) res = 1
    else if(major < 20) res = 2
    else res = 3
    console.log(res)
}