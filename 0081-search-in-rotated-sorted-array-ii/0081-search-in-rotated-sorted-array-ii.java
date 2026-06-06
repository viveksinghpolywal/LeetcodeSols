class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int n=nums.length;
        int high=n-1;
        boolean output=false;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) {output=true; break;}
            
            if(nums[low]<nums[mid] ){
                if(target>=nums[low] && target<=nums[mid]){
                    high=mid-1;
                }    
                
               else{ low=mid+1;}
            }
            
            else if(nums[low] > nums[mid]) {
                if(target>nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else{high=mid-1;}
                
                
            }
            else{
                low+=1;
            }

        }
        return output;
    }
}