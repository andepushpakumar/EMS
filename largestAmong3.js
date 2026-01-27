function large(a,b,c){
    if(a>b &&a>c){
        return a;
    }
    else if(b>c&&b>a){
        return b;
    }
    else {
        return c;
    }
}
let a=3;
let b=7;
let c=5;
console.log("The largest number among "+a+", "+b+" and "+c+" is: "+large(a,b,c));