class Solution {
   boolean isContains(String str1,String str2){
        if(str2.contains(str1)){
            return true;
        }
        else{
            return false;
        }
   }
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<>();
        Arrays.sort(words,(a,b)->Integer.compare(
            a.length(),b.length()
        ));
        int n=words.length;
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
             if(isContains(words[i],words[j])){
               ans.add(words[i]);
               break;
             }
        }  
        }
        return ans;
    }
}