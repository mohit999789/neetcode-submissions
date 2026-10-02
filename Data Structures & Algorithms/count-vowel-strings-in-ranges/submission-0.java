class Solution {
    int helper(int query[],String[] words){
        int lr=query[0];
        int ur=query[1];
        Set<Character>set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count=0;
        for(int i=lr;i<=ur;i++){
            String word=words[i];
            if(set.contains(word.charAt(0)) && set.contains(word.charAt(word.length()-1))){
                count++;
            }
        }
        return count;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=queries.length;
        int ans[]=new int[n];
       for(int i=0;i<n;i++){
          int query[]=queries[i];
          int len=helper(query,words);
           ans[i]=len;
       }
       return ans;
    }
}