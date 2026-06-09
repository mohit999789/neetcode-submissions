class KthLargest {
      private PriorityQueue <Integer> pq; 
       private int k;
    public KthLargest(int k, int[] arr) {
       this.k = k;
        pq = new PriorityQueue<>(); // min-heap
      for (int n : arr) {
            add(n);
        }


    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size()>k){
              pq.poll();
        }
        return pq.peek();
       
    }
}
