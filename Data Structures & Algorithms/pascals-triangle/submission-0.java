class Solution {
    public List<List<Integer>> generate(int numRows) {
        int arr[][]=new int[numRows][numRows];
        List<List<Integer>> ans=new ArrayList<>();
        arr[0][0]=1;
        for(int i=1;i<numRows;i++){
          arr[i][0]=1;// Static 
        for(int j=1;j<i;j++){
           arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
        }   
        arr[i][i]=1;// Static
        }
        for(int i=0;i<numRows;i++){
          List<Integer> row=new ArrayList<>();
          for(int j=0;j<=i;j++){
            row.add(arr[i][j]);
          }
          ans.add(row);
        }
        return ans;
    }
}