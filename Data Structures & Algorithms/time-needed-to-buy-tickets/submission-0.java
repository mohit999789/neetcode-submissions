class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]>q=new LinkedList<>();
          int n=tickets.length;
          for(int i=0;i<n;i++){
            q.offer(new int[]{i,tickets[i]});
          }
          int second=0;
          while(!q.isEmpty()){
            int person[]=q.poll();
            //Person buys the ticket. 
            person[1]--;
            second++;
            if(person[0]==k && person[1]==0)
           {
            return second;
           }
            if(person[1]>0){
                q.offer(person);
            }
          }
          return second;
    }
}