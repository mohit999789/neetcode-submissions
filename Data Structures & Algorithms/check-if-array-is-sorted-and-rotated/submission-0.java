class Solution {
   boolean isSorted(int arr[]){
       for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
           return false;
        }
       }
       return true;
    }
    void reverse(int []arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public boolean check(int[]arr){
        int n=arr.length;
        boolean flag=false;
        int idx=-1;
        for(int i=0;i<n-1;i++){
          if(arr[i]>arr[i+1]){
            idx=i;
            break;
          }
        }
        if(idx==-1){
            return true;
        }
        reverse(arr,0,idx);
        reverse(arr,idx+1,n-1);
        reverse(arr,0,n-1);
       return isSorted(arr);
    }
}