class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
           int n1=arr1.length;
           int n2=arr2.length;
           int ans[]=new int[n1];
           for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
              if(arr1[i]==arr2[j]){
                int k=j+1,temp=-1;
                int track=arr2[j];
                while(k<n2){
                    if(arr2[k]>track){
                        track=arr2[k];
                        break;
                    }
                    k++;
                }
                if(track!=arr2[j]){
                    temp=track;
                }
                ans[i]=temp;
                break;
              }
           }
           }
           return ans;
    }
}