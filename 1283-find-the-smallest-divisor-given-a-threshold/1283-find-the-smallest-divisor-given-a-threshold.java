class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int high=maxNum(nums);
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isDivisor(nums,mid,threshold)){
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return low;
        
        
    }
    private int ceil(int A, int b){
        return (A+b-1)/b;
    }
    private boolean isDivisor(int[] nums,int mid, int t){
        long sum=0;
        for(int el:nums){
            sum+=ceil(el,mid);
        }
        return sum<=t;
    }
    private int maxNum(int[] nums){
        int maxEl=Integer.MIN_VALUE;
        for(int el:nums){
            maxEl=Math.max(el,maxEl);
        }
        return maxEl;
    }
}