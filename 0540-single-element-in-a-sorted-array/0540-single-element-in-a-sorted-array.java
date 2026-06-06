class Solution {
    public int singleNonDuplicate(int[] nums) {
         int left=0;
         int n=nums.length;
         int right=n-1;
         int ans=Integer.MIN_VALUE;
         while(left<=right){
            int mid=left+(right-left)/2;
            if(n==1) { ans=nums[0]; break;}
            if(nums[mid]==nums[mid-1] || nums[mid]==nums[mid+1]){
                if(nums[left]!=nums[left+1]) {ans=nums[left]; break;}
                else if(nums[right]!=nums[right-1]) {ans=nums[right];break;}
                else {
                    left=left+2;
                    right=right-2;}

             }
             else{
                ans=nums[mid]; break;
             }
         }
         return ans;
    }
}