function demo(){
    console.log("This is a demo function.");
}
demo();

function demo1(car){
    console.log("This is a demo function with a parameter: " + car);
}
demo1("BMW");

function demo3(a,b){
    return a + b;
}
console.log(demo3(2,3));

let sum=(a,b)=>a+b;
console.log(sum(5,7));