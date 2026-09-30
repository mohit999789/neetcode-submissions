class Solution {
    public int maxAscendingSum(int[] arr){
    int i=0,j=1;  
    int sum=arr[0];
    int maxSum=Integer.MIN_VALUE;
    int n=arr.length;
    while(j<n){
     if(arr[j]>arr[j-1]){
        sum+=arr[j];
     }
     else if(!(arr[j]>arr[j-1])){
        if(sum>maxSum){
            maxSum=sum;
        }
        i=j;
        sum=arr[j];
     }
     j++;
    }
     if(sum>maxSum){
            maxSum=sum;
        }
        return maxSum;
    }
}