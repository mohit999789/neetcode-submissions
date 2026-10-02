class Solution {
    public List<String> commonChars(String[] words) {
        int n=words.length;
        List<String>list=new ArrayList<>();
        if(n==1){
           for(char ch : words[0].toCharArray()){
    list.add(String.valueOf(ch));
}
            return list;
        }
        list.clear();//Deleting all the elements from the list 
    Map<Character,Integer>curr=new HashMap<>();
    for(char ch:words[0].toCharArray()){
          curr.put(ch,curr.getOrDefault(ch,0)+1);
        }
    for(int i=1;i<n;i++){
    Map<Character,Integer>mp=new HashMap<>();
        for(char ch:words[i].toCharArray()){
          mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
      for(Map.Entry<Character,Integer>entry:curr.entrySet()){
       if(mp.containsKey(entry.getKey())){
          entry.setValue(Math.min(entry.getValue(),mp.get(entry.getKey())));
       } 
       else{
        entry.setValue(0);
       }
      }
    }
    for(Map.Entry<Character,Integer>entry:curr.entrySet()){
        int temp=0;
         while(temp<entry.getValue()){
            list.add(String.valueOf(entry.getKey()));
            temp++;
         }
      }
    return list;
    }
}