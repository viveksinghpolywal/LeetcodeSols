class Solution {
    
    public int shipWithinDays(int[] weights, int days) {
        
        int low=0;
        int high=0;
        for(int el:weights){
            low=Math.max(low,el);
            high+=el;
        }
        while(low<=high){
             int mid=low+(high-low)/2;
             if(isValidCapacity(weights,days,mid)){
                high=mid-1;
             }
             else{
                low=mid+1;
             }
        }
        return low;
        

    }
    private boolean isValidCapacity(int[] weights,int days, int mid){
        int sum=0;
        int day=1;
        for(int weight:weights){
            if(sum+weight>mid){
                ++day;
                sum=weight;
            }
            else{
                sum+=weight;
            }
            
        }
        return day<=days;
    }
}

// class Solution {
//     public int shipWithinDays(int[] nums, int threshold) {
//         int n=nums.length;
//         int low=1;
//         int high=maxNum(nums);
//         int ans=0;
//         while(low<=high){
//             int mid=low+(high-low)/2;
//             if(isValid(nums,mid,threshold)){
//                 high=mid-1;

//             }
//             else{
//                 low=mid+1;
//             }
//         }
//         return low;
        
        
//     }
//     // private int ceil(int A, int b){
//     //     return (A+b-1)/b;
//     // }
//     private boolean isValid(int[] nums,int mid, int t){
//         long sum=0; int cnt=0;
//         for(int el:nums){
//             cnt+=1;
//             if(cnt<=t)
//             {sum+=el;}
//         }
//         return sum<=mid;
//     }
//     private int maxNum(int[] nums){
//         int maxEl=Integer.MIN_VALUE;
//         for(int el:nums){
//             maxEl+=Math.max(el,maxEl);
//         }
//         return maxEl;
//     }
// }