class Solution {
    public int findLucky(int[] arr) {
       Map<Integer,Integer>mp=new HashMap<>();
       int ans=-1;
       for(int a:arr){
        mp.put(a,mp.getOrDefault(a,0)+1);
       }
       for(int a:arr){
        if(mp.get(a)==a){
         if(a>ans){
            ans=a;
         }
        }
       }
      return ans;
    }
}