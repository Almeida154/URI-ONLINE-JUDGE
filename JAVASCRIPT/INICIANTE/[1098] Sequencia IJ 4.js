var cont = 0
for(let i = 0; i <= 2; i += 0.2) {
    for(let j = 1; j < 4; j++, cont++) {
        if(cont >= 30) console.log(`I=${i.toFixed(0)} J=${(j + i).toFixed(0)}`)
        else{
            if(Number.isInteger(i)) console.log(`I=${i.toFixed(0)} J=${(j + i).toFixed(0)}`)
            else console.log(`I=${i.toFixed(1)} J=${(j + i).toFixed(1)}`)
        }
    }
}