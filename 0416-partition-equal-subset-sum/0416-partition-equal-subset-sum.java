class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        int target = total / 2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for(int num:nums){
            for(int s=target;s>= num;s--){
                if(dp[s-num]){
                    dp[s]=true;
                }
            }
            for(int s=target;s>=0.0;s--){
                if(dp[target]){
                    if(total-2*s==0) return true;
                }
            }
        }
        return false;
    }
}