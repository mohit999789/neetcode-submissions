class Solution {
    String helper(String str1,String str2){
         int i=0,j=0;
         int n1=str1.length();
         int n2=str2.length();
         StringBuilder sb=new StringBuilder();
         while(i<n1 && j<n2){
            if(str1.charAt(i)==str2.charAt(j)){
                sb.append(str1.charAt(i));
                i++;j++;
            }
            else{
                break;
            }
         }
         return sb.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        int i=2,n=strs.length;
        if(n==1){
            return strs[0]; 
        }
        String temp=helper(strs[0],strs[1]);
        while(i<n){
           temp=helper(temp,strs[i]);
           i++;
        }
       return temp;
    }
}