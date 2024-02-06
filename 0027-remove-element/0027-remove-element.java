class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int index=0;
        int j=nums.length;
        while(i<j)
        {
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
            i++;
            
        }
        return index;
    }
}