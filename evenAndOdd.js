let nums=[3,5,7,2,8,1];
let evenCount=0;
let oddCount=0;
for(let i=0;i<nums.length;i++){
    if(nums[i]%2===0){
        evenCount++;
    }       
    else{
        oddCount++;
    }
}
console.log("The count of even numbers is: " + evenCount);
console.log("The count of odd numbers is: " + oddCount);