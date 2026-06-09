class Solution {
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int num:arr){
          pq.offer(num);
        }
        while(pq.size()>1){
            int last=pq.poll();
             int seclast=pq.poll();
             if(last>seclast){
              pq.offer(last-seclast);
             }
        }
        return pq.size()==1?pq.peek():0;
    }
}
