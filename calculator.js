function numberCalculator(a, b, operation) {
 if (operation === '+') {
     return a + b;
 } else if (operation === '-') {
     return a - b;
 }
    else if (operation === '*') {   
    return a * b;
 }
    else if(operation === '%'){
    return a % b;
    }
    else if (operation === '/') {   
    if (b !== 0) {
        return a / b;
    } else {
        return 'Error: Division by zero';
    }           
    } else {    
    return 'Error: Invalid operation';
    }
}
    console.log(numberCalculator(10, 5, '+')); 
    console.log(numberCalculator(10, 2, '-')); 
    console.log(numberCalculator(10, 5, '*'));
    console.log(numberCalculator(10, 3, '%')); 
    console.log(numberCalculator(10, 2, '/'));
    console.log(numberCalculator(10, 0, '/'));       
