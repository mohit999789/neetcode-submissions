class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       Queue<Integer>q=new LinkedList<>();
       //All students to queue
       for(int a:students){
          q.offer(a);
       }
       int skipped=0;
       int i=0;
       while(!q.isEmpty() && skipped<q.size()){
        int student=q.poll();
        if(student==sandwiches[i]){
            //student will take the sandwich. 
          i++;
          skipped=0;
        }
        else{
           //Student goes to the end. 
           q.offer(student);
          skipped++;
        }
       }
       return q.size();
    }
}