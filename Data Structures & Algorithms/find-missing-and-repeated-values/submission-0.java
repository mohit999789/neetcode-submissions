class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        Map<Integer,Integer>mp=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
             mp.put(grid[i][j],mp.getOrDefault(grid[i][j],0)+1);
           }
        }
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                st.add(grid[i][j]);
            if(mp.containsKey(grid[i][j])){
                if(mp.get(grid[i][j])==2){
                  ans[0]=grid[i][j];
                }
            }
            }
        }
        for(int i=1;i<=row*row;i++){
            if(!st.contains(i)){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}