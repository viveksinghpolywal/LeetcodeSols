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
