class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        char []ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(st.size()==0){
                st.push(ch[i]);
                continue;
            }
           if(ch[i]=='(' || ch[i]=='{' || ch[i]=='['){
            st.push(ch[i]);
           }
           else{
          if(ch[i]==')') {
            if(!(st.peek()=='(')){
                 return false;
            }
            st.pop();
           }
          if(ch[i]=='}') {
            if(!(st.peek()=='{')){
                 return false;
            }
            st.pop();
           } 
            if(ch[i]==']') {
            if(!(st.peek()=='[')){
                 return false;
            }
            st.pop();
           } 
        //   st.pop();
           }
        }
        if(st.size()!=0)
        {
            return false;
            }
            return true;

    }
}
