class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        int ansarr[]=new int[2];
           ansarr[0] = -1;
          ansarr[1] = -1;
        while(i<j){
          if(arr[i]+arr[j]==target){
           ansarr[0]=i+1;
           ansarr[1]=j+1;
           return ansarr;
          }
          if(arr[i]+arr[j]<target){
          i++;
          }
          if(arr[i]+arr[j]>target){
          j--;
          }
        }
        return ansarr;
    }
}
