class MinStack {
    Stack <Integer> org;
     Stack <Integer> minst;
    public MinStack() {
          org=new Stack<>();
          minst=new Stack<>(); 
    }
    
    public void push(int val) {
        if(minst.size()==0){
          minst.push(val);
        }
       else if(val<=minst.peek()){
          minst.push(val); 
        }
        org.push(val);
    }
    
    public void pop() {
      int temp=org.pop();
      if(minst.peek()==temp){
       minst.pop();
      }    
    }
    
    public int top() {
         return org.peek();    
    }
    
    public int getMin() {
        return minst.peek();
    }
}
