class Solution {
    public int numIdenticalPairs(int[] arr) {
        int pair=0,n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             if(i<j & arr[i]==arr[j]){
                pair++;
             }
        }
        }
        return pair;
    }
}