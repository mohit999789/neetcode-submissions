class Solution {
    public int countCharacters(String[] words, String chars) {
       // This is a simulation problem. 
       int ans=0;
       boolean flag=true;
       Map<Character,Integer>mp=new HashMap<>();
       for(char ch:chars.toCharArray()){
        mp.put(ch,mp.getOrDefault(ch,0)+1);
       }
       //Now process each word. 
       for(String str:words){
       Map<Character,Integer>temp=new HashMap<>(mp);
        flag=true;
        for(int i=0;i<str.length();i++){
            if(temp.containsKey(str.charAt(i))){
                temp.put(str.charAt(i),temp.getOrDefault(str.charAt(i),0)-1); 
                if(temp.get(str.charAt(i))==0){
                    temp.remove(str.charAt(i));
                }
            }
           else{
            flag=false;
            break;
           }
        }
        // Resetting the flag 
        if(flag==true){
            ans+=str.length();
            
        }
          

       }
       return ans;
    }
}