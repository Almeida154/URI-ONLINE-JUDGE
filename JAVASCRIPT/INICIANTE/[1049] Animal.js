var input = require('fs').readFileSync('dev/stdin/file.txt', 'utf8')
var lines = input.split('\n')

var tipo1 = lines.shift().toString()
var tipo2 = lines.shift().toString()
var tipo3 = lines.shift().toString()

switch(tipo1){
    case 'vertebrado':
        switch(tipo2){
            case 'ave':
                switch(tipo3){
                    case 'carnivoro':
                        console.log('aguia')
                        break
                    case 'onivoro':
                        console.log('pomba')
                        break
                }
                break

            case 'mamifero':
                switch(tipo3){
                    case 'herbivoro':
                        console.log('vaca')
                        break
                    case 'onivoro':
                        console.log('homem')
                        break
                }
                break
        }
        break
    case 'invertebrado':
        switch(tipo2){
            case 'inseto':
                switch(tipo3){
                    case 'hematofago':
                        console.log('pulga')
                        break
                    case 'herbivoro':
                        console.log('lagarta')
                        break
                }
                break
            case 'anelideo':
                switch(tipo3){
                    case 'hematofago':
                        console.log('sanguessuga')
                        break
                    case 'onivoro':
                        console.log('minhoca')
                        break
                }
                break
        }
        break
}