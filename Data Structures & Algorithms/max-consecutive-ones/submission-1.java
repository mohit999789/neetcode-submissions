class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i=0,j=0;
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        int len=0;
        while(j<n){
            if(arr[j]==1){
                j++;
            }
            else{
                 len=j-i;
                if(len>ans){
                    ans=len;
                }
                i=j+1;
                j++;
            }
        }
        len=j-i;
        if(len>ans){
                    ans=len;
                }
return ans;
    }
}