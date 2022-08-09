let total = (subtotal:number, iva = 0.21):number => { return subtotal * (iva + 1);}

console.log(total(10, 0.21))

console.log(total(20))

console.log(total(30, 0.23))