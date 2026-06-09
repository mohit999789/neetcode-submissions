class Solution {
    public int findKthLargest(int[] arr, int k) {
          PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int num:arr){
          pq.offer(num);
        }  
          while(k-1>0){
            pq.poll();
            k--;
          }
         return  pq.peek();
    }
}
