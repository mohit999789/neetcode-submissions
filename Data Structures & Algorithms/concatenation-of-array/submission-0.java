class Solution {
    public int[] getConcatenation(int[] arr) {
        int n=arr.length;
        int ans[]=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i++){
            if(j<n){
             ans[i]=arr[j];
            }
            else{
                ans[i]=arr[j-n];
            }
            j++;
        }
        return ans;
    }
}