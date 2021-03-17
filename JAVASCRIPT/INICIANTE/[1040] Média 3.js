var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

linha1 = lines[0].split(' ')
    n1 = Number(linha1[0])
    n2 = Number(linha1[1])
    n3 = Number(linha1[2])
    n4 = Number(linha1[3])

    media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10

    console.log(`Media: ${media.toFixed(1)}`)
    if(media >= 7) console.log("Aluno aprovado.")
    else if(media < 5) console.log("Aluno reprovado.")
    else{
        console.log("Aluno em exame.")
        linha2 = lines[1].split(' ')
        notaExame = Number(linha2[0])
        console.log(`Nota do exame: ${notaExame.toFixed(1)}`)
        novaMedia = (media + notaExame) / 2
        if(novaMedia >= 5) console.log("Aluno aprovado.")
        else console.log("Aluno reprovado.")
        console.log("Media final: "+novaMedia.toFixed(1))
    }