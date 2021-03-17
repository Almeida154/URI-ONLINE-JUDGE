var s = 1
for(var i = 2, j = 3; j <= 39; i *= 2, j += 2) s += (j / i)
console.log(s.toFixed(2))
