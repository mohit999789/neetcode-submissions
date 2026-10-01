class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String detail:details){
             int num1=detail.charAt(11)-'0';
             int num2=detail.charAt(12)-'0';
             int temp=num1*10+num2;
             if(temp>60){
                count++;
             }
        }
        return count;
    }
}