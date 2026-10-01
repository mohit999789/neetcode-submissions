class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        // with extra Space
        // """
        // int lower=1;
        // int upper=arr.length;
        // Set<Integer>st=new HashSet<>();
        // List<Integer> ans=new ArrayList<>();
        // for(int a:arr){
        //     st.add(a);
        // }
        // for(int i=lower;i<=upper;i++){
        //  if(!st.contains(i)){
        //     ans.add(i);
        //  }
        // }
        // return ans;
       
        // Without Extra space
        int i=0,n=arr.length;   
        List<Integer> ans=new ArrayList<>(); 
        while(i<n){
         int curr=arr[i];
         int corrIdx=curr-1;
         if(curr!=arr[corrIdx]){
            int temp=arr[corrIdx];
            arr[corrIdx]=curr;
            arr[i]=temp;
         }
         else{
           i++;
         }
       }
      for(int j=0;j<n;j++){
        if(j+1!=arr[j]){
            ans.add(j+1);
        }
      }
      return ans;
    }
}