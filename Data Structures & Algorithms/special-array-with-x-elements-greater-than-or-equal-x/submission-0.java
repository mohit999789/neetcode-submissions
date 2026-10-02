class Solution {
    public int specialArray(int[] arr) {
      int n=arr.length;
      int track=1;
      while(track<=n){ 
        int count=0;
       for(int i=0;i<n;i++){
        if(arr[i]>=track){
            count++;
        }
       }
       if(track==count){
       return track;
       }
       else{
        track++;
       }
      }  
      return -1;
    }
}