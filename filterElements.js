let nums=[3,5,7,2,8,1];
let result=nums.filter(function(num){
    return num>4;
});
console.log("Elements greater than 4 in " + nums + " are: " + result);

let result2=nums.filter(num => num%2===0);
console.log("Even elements in " + nums + " are: " + result2);

let names=["ferrari","bugatti","lambo","porsche","audi"];
let fastCars=names.filter(car=>car.length>5);
console.log("Cars with names longer than 5 characters: " + fastCars);