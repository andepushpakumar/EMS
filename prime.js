function prime(num) {
    if (num <= 1) {
        return false;
    }
    let n=2;
    while (n<=num) {
        if(num%n===0 && n!==num){
            return false;
        }
        n++;
    }
    return true;    
}
let num=13;
if(prime(num)){
    console.log(num + " is a prime number.");
}
else{
    console.log(num + " is not a prime number.");
}