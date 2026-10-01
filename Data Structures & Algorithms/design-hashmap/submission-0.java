class Node{
    int key;
    int value;
    Node(int key,int value){
        this.key=key;
        this.value=value;
    }
}
class MyHashMap {
ArrayList<Node>[] buckets;
    public MyHashMap() {
        buckets=new ArrayList[1000];
        for(int i=0;i<1000;i++){
            buckets[i]=new ArrayList<>();
        }
    }
    
    public void put(int key, int value){
          int index=key%1000;
          ArrayList<Node>list=buckets[index];
          for(Node node:list){
            if(node.key==key){
                node.value=value;
                 return;
            }
           }
           // if key doesn't exist
           list.add(new Node(key,value));
    }
    
    public int get(int key) {
           int index=key%1000;
           ArrayList<Node>list=buckets[index];
           for(Node node:list){
            if(node.key==key){
                return node.value;
            }
           }
           return -1;  // key doesn't exist
    }
    
    public void remove(int key) {
        int index=key%1000;
         ArrayList<Node>list=buckets[index];
         for(int i=0;i<list.size();i++){
            if(list.get(i).key==key){
                list.remove(i);
                return;
            }
         }

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */