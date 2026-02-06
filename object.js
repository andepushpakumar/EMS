// let employee={
//     name:"Kumar",  
//     age:23,
//     position:"Associate Developer"    
// }
// console.log(employee);

// let employees={
//     company:"Empliz",
//     emps:{
//         emp1:{
//             name:"Kumar",  
//             age:23,
//     },
//     emp2:{
//         name:"Narasimha",  
//         age:25,         
//     },
//     emp3:{
//         name:"Noor",  
//         age:24,         
//     }
// }
// }
// for(let key in employees.emps){
//     // console.log("Employee Name:",employees.emps[key].name);
//     // console.log("Employee Age:",employees.emps[key].age);           

//     // console.log("Employee ID:",key);
//     // console.log(employees.emps[key]);
//     console.log(`Employee ID: ${key} => Name: ${employees.emps[key].name}, Age: ${employees.emps[key].age}` );
// }

// let cars={
//     brand:"BMW",
//     model:"X5",
//     year:2020,
//     color:"Black"   
// }
// cars.year=2021;
// cars.color="White";
// cars.price="$60,000";
// console.log(cars);     


// let cars={
//     brand:"BMW",
//     model:"X5",
//     year:2020,
//     color:"Black"   
// }
// delete cars.color;
// delete cars.year;
// console.log(cars);


// let cars={
//     brand:"BMW",
//     model:"X5",
//     year:2025,
//     result:function(){
//         if (this.year>2024)
//         return `${this.brand} is a future car .`;
//     }
// }
// console.log(cars.result());

// let employee=[
//     {id:1,name:"Kumar",age:23,position:"Associate Developer"},
//     {id:2,name:"Narasimha",age:25,position:"Senior Developer"},
//     {id:3,name:"Noor",age:24,position:"Project Manager"}    
// ]
// for (let emp of employee){
//   "Id",emp.id
//   "Name",emp.name
//   "Age",emp.age
//   "Position",emp.position
//   console.log(`Id: ${emp.id}, Name: ${emp.name}, Age: ${emp.age}, Position: ${emp.position}`);
// }