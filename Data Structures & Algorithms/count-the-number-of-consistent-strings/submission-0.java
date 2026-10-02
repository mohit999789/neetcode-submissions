class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character>set=new HashSet<>();
        int count=0;
        for(char ch:allowed.toCharArray()){
            set.add(ch);
        }
        boolean flag;
        for(String word:words){
            flag=true;
            for(char ch:word.toCharArray()){
                if(!set.contains(ch)){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
              count++;
            }
        }
        return count;
    }
}