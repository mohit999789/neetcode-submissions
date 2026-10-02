class Solution {
    
    public List<Integer> getRow(int rowIndex) {
        int arr[][]=new int[rowIndex+1][rowIndex+1];
          arr[0][0]=1;
          for(int i=1;i<=rowIndex;i++){
            arr[i][0]=1;
            for(int j=1;j<i;j++){
               arr[i][j]=arr[i-1][j]+arr[i-1][j-1];  
          }
          arr[i][i]=1;
          }
          // Now collect the answer. 
           List<Integer>ans=new ArrayList<>();
         int temp[]=arr[rowIndex];
         for(int a=0;a<=rowIndex;a++){
          ans.add(temp[a]);
         }
         return ans;
    }
}