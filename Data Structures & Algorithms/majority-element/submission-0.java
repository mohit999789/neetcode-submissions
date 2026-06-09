class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
      for(int i=0;i<n;i++){
    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
      }
      for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()>n/2){
            return entry.getKey();
        }
      }
      return -1;
    }
}