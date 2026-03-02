/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let current_sum = nums[0];
  let max_so_far = nums[0];
  for (let i = 1; i < nums.length; i++) {
    const num = nums[i];
    current_sum = Math.max(num, current_sum + num);
    max_so_far = Math.max(max_so_far, current_sum);
  }
  return max_so_far;
};