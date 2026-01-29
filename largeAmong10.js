let nums=[3,5,7,2,8,1,20,15,6,4];
let large=nums[0]
for(let i=0;i<nums.length;i++){
    if(nums[i]>large){
        large=nums[i];
    }
}
console.log("The largest number among " + nums + " is: " + large);