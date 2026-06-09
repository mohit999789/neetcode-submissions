class Solution {
    public boolean validWordAbbreviation(String str, String abbr){
       int n=abbr.length();
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(j<n){
            if(Character.isAlphabetic(abbr.charAt(j))){
                sb.append(abbr.charAt(j));
                i++;
                j++;
            }
           else if(Character.isDigit(abbr.charAt(j))){
                int track=abbr.charAt(j)-'0';
               if(j+1<n && Character.isDigit(abbr.charAt(j+1))){
                   track=track*10+(abbr.charAt(j+1)-'0');
                   j++;
               }
               if(track==0){
                   return false;
               }
               if (track>str.length()){
              return false;
               }
               while(track > 0 && i < str.length()){
                  sb.append(str.charAt(i));
                          i++;
                          track--;

        }
               j++;
            }
        }
    if(sb.toString().equals(str)){
        return true;
    }
    else {
        return false;
    }
    }
}
