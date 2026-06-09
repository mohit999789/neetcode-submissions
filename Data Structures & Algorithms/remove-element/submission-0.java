class Solution {
    public int removeElement(int[] arr, int val) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
          if(arr[i]!=val )
          {
            i++;
          }
         else if(arr[j]==val)
          {j--;
            
          }
          else{
            int temp=arr[j];
             arr[j]=arr[i];
             arr[i]=temp;
             i++;
            j--;
          }
        }
        
        return i;
    }
}