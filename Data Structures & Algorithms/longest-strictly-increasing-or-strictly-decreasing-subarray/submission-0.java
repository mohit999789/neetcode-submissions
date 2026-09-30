class Solution {
    public int longestMonotonicSubarray(int []arr) {
     int inc=Integer.MIN_VALUE;   
     int dec=Integer.MIN_VALUE;
     // We are finding the longest increasing subarray. 
     int count=0;   
     int n=arr.length;
     int i=0,j=1;
     while(j<n){
      if(!(arr[j]>arr[j-1])){
         count=j-i; 
         i=j;
      }
      if(count>inc){
        inc=count;
      }
      j++;
     }
     count=j-i;
     if(count>inc){
        inc=count;
      }
  //Now we are finding the longest decreasing subarray. 
    count=0;
    i=0;
    j=1;
    while(j<n){
      if(!(arr[j]<arr[j-1])){
         count=j-i; 
         i=j;
      }
      if(count>dec){
        dec=count;
      }
      j++;
     }
     count=j-i;
     if(count>dec){
        dec=count;
      }
      return Math.max(inc,dec);
    }
}