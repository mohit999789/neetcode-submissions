class Pair{
    int key;
    int value;
    Pair(int key,int value){
        this.key=key;
        this.value=value;
    }
}
class MyHashMap {
 int size=10000;
 List<Pair>[]bucket;
    public MyHashMap(){
        bucket=new ArrayList[size];
        for(int i=0;i<size;i++){
            bucket[i]=new ArrayList<>();
        }
    }
    
    public void put(int key, int value) {
         int index=key%size;   //applying the hashing function
         List<Pair>chain=bucket[index];
         for(Pair pair:chain){
            if(pair.key==key){
                pair.value=value;
                return;
            }
         }
         chain.add(new Pair(key,value));
    }
    
    public int get(int key){
       int index=key%size; //applying the hashing function 
         List<Pair>chain=bucket[index];
         for(Pair pair:chain){
            if(pair.key==key){
                return pair.value;
            }
         } 
         return -1;
    }
    
    public void remove(int key) {
       int index=key%size; //applying the hashing function 
         List<Pair>chain=bucket[index];
         for(int i=0;i<chain.size();i++){
            if(chain.get(i).key==key){
                chain.remove(i);
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