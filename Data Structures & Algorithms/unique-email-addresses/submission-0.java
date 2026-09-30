class Solution {
    String cleaner(String email){
        StringBuilder sb=new StringBuilder();
        boolean plusFlag=false;
        boolean asteriskFlag=false;
      for(int i=0;i<email.length();i++){
        if(email.charAt(i)=='@'){
            sb.append(email.charAt(i));
            asteriskFlag=true;
            continue;
        }
        if(asteriskFlag==true){
         sb.append(email.charAt(i));
         continue;
        }
        if(email.charAt(i)=='+'){
            plusFlag=true;
            continue;
        }
        if(plusFlag==true){
            continue;
        }
        if(email.charAt(i)=='.'){
            continue;
        }
     sb.append(email.charAt(i));
      }
      return sb.toString();
    }
    public int numUniqueEmails(String[] emails) {
        int n=emails.length;
        Set<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
          String email=cleaner(emails[i]);
          set.add(email);
        }
        return set.size();
    }
}