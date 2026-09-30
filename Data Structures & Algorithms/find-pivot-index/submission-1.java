class Solution {
    public int pivotIndex(int[] arr) {
     //Here we will use a prefix sum data structure. Why? Because for each index we need the sum of each index up to that place on the right side as well as on the left side as well.  
     int n=arr.length;
     int prefixLeftSum[]=new int[n];
     int prefixRightSum[]=new int[n];
     //populating the prefix sum from the left side 
     prefixLeftSum[0]=arr[0];
     for(int i=1;i<n;i++){
        prefixLeftSum[i]=arr[i]+prefixLeftSum[i-1];
     }
    //populating the prefix sum from the right side 
     prefixRightSum[n-1]=arr[n-1];
     for(int i=n-2;i>=0;i--){
        prefixRightSum[i]=arr[i]+prefixRightSum[i+1];
     }
     // Now Finding the answer 
     for(int i=0;i<n;i++){
        if(prefixLeftSum[i]==prefixRightSum[i]){
            return i;
        }
     }
return -1;
    }
}