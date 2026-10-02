class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] ans=new int[2];
        int n=arr.length;
        int i=0;
        while(i<n){
           int curr=arr[i];
           int corrIdx=curr-1;
           if(curr!=arr[corrIdx]){
            // Swapping 
            int temp=arr[corrIdx];
            arr[corrIdx]=curr;
            arr[i]=temp;
           }
           else{
            i++;
           }
        }//
        for(int j=0;j<n;j++){
            if(j+1==arr[j]){
                continue;
            }
            else if(j+1!=arr[j]){
                ans[0]=arr[j];//Dupicate
                ans[1]=j+1;// Missing
                break;
            }
        }
        return ans;
    }
}