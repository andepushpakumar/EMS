function large() {
    let max=nums[0];
    for (let i = 1; i < nums.length; i++) {
        if (nums[i] > max) {
            max = nums[i];      
}
    }
     return max;
}
let nums=[3,5,7,2,8,1];
console.log("The largest number among " + nums + " is: " + large(nums));