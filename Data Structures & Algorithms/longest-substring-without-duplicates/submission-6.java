class Solution {
    public int lengthOfLongestSubstring(String s) {
         Set <Character> set=new HashSet<>();
         int i=0,j=0;
         int maxlen=0;
        if( s.length()==1){
          return 1;
        }
        while(j<s.length()){
          if(set.contains(s.charAt(j))){
             maxlen=Math.max(maxlen,j-i); 
             set.remove(s.charAt(i));
             i++;
          }
          else{
            set.add(s.charAt(j));
             j++;
          }
         
        }
        if(maxlen<set.size()){
          return set.size();
        }
        return maxlen;
    }
}
