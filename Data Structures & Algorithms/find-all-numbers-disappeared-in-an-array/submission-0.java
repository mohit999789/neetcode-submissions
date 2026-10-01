class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // with extra Space
        int lower=1;
        int upper=nums.length;
        Set<Integer>st=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int a:nums){
            st.add(a);
        }
        for(int i=lower;i<=upper;i++){
         if(!st.contains(i)){
            ans.add(i);
         }
        }
        return ans;
    }
}