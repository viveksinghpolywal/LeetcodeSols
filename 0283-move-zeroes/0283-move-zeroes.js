/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let swapindex=0;
    for(let i=0;i<nums.length;i++){
        
        if(nums[i]!==0){
            nums[swapindex]=nums[i];
            swapindex++;
        }

    }
    for(let x=swapindex; x<nums.length;x++){
        nums[x]=0;
    }
};