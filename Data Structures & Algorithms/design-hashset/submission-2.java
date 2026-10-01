class MyHashSet {
int numBuckets;
  ArrayList<LinkedList<Integer>>buckets;// This is an array list of linked lists. That means we are making the array list in which we have chaining and we are implementing the chaining method to design the hash set. 
   int getHashValue(int key){
        return key%numBuckets;
    }
    public MyHashSet(){
        numBuckets=15000;
        buckets=new ArrayList<>();
        for(int i=0;i<numBuckets;i++){
            buckets.add(new LinkedList<>());
        }
    }
    public void add(int key) {
           int index=getHashValue(key);
           if(!buckets.get(index).contains(key)){
            buckets.get(index).add(key);
           }
    }
    
    public void remove(int key){
          int index=getHashValue(key);
          if(buckets.get(index).contains(key)){
            buckets.get(index).remove(Integer.valueOf(key));
          }
    }
    
    public boolean contains(int key) {
        int index=getHashValue(key);
        return buckets.get(index).contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */