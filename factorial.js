function fact(n){
    let res=1;
    for(let i=1;i<=n;i++){
        res=res*i;
    }   
    return res;
}
let num=3;
console.log("The factorial of "+num+" is: "+fact(num));