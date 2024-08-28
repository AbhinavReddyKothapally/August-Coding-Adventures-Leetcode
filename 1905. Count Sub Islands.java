class Solution {
    int n;
    int m;
    boolean isSubIsland;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        n=grid2.length;
        m=grid2[0].length;
        int count = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(grid2[i][j]==1){
                    isSubIsland = true;
                    dfs(grid1,grid2,i,j);
                    if(isSubIsland)
                        count++;
                }
        return count;
    }
    public void dfs(int[][] grid1,int[][] grid2,int i,int j){
        if(i<0||i>=n||j<0||j>=m||grid2[i][j]!=1)
            return;
        if(grid1[i][j]!=grid2[i][j])
            isSubIsland = false;
        grid2[i][j] = 0;
        dfs(grid1,grid2,i+1,j);
        dfs(grid1,grid2,i-1,j);
        dfs(grid1,grid2,i,j+1);
        dfs(grid1,grid2,i,j-1);
    }
}
