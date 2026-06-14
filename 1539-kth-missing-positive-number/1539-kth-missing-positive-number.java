class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int high=n-1;
        //if(n<=1) low=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int missing=arr[mid]-(mid+1);
            if(missing>=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low+k;

    }
}