function reverse(num){
    let rev=0
    while(num>0){
        let digit=num%10
        rev=rev*10+digit
        num=Math.floor(num/10);
    }
    return rev;
}
let num=123
console.log("The reverse of "+num+" is: "+reverse(num));    