class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int current=grid[i][j];
                if(current=='1'){
                    count++;
                    dfs(grid,i,j,m,n);
                }

            }
        }
        return count;
    }
    private void dfs(char[][] grid,int row,int col,int m,int n){
        if(row<0 || col<0 || row>=m || col>=n)
        return;
        if(grid[row][col]!='1')
        return;
        grid[row][col]='!';
        dfs(grid,row-1,col,m,n);
        dfs(grid,row,col+1,m,n);
        dfs(grid,row+1,col,m,n);
        dfs(grid,row,col-1,m,n);


    }
}