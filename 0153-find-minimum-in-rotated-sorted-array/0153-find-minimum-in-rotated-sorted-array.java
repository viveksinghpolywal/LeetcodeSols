class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int n=nums.length;
        int right=n-1;
        int min=Integer.MAX_VALUE;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<min) min=Math.min(nums[mid],min);
            if(nums[left]<=nums[mid]){
                if(nums[left]<min) min=Math.min(nums[left],min);
                else{left=mid+1;}
            }
            else if(nums[mid+1]<nums[right]){
                if(nums[mid]<min) min=Math.min(nums[mid],min);
                else{ right=mid+1;}
            }
            else{
                left=left+1;
            }
        }
        return min;
    }
}