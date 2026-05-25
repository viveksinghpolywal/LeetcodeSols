class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        int[] current=intervals[0];
        ans.add(current);
        for(int i=1;i<intervals.length;i++){
            int currentStart=intervals[i][0];
            int currentEnd=intervals[i][1];
            if(currentStart<=current[1]){
                current[1]=Math.max(current[1],currentEnd);
            }
            else{
                current=intervals[i];
                ans.add(current);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}