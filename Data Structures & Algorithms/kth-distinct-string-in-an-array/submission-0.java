class Solution {
    public String kthDistinct(String[] arr, int k) {
     LinkedHashMap<String,Integer>mp=new LinkedHashMap<>();
     for(int i=0;i<arr.length;i++){
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
     }   
     int count=0;
     for(Map.Entry<String,Integer>entry:mp.entrySet()){
        if(entry.getValue()==1){
            count++;
            if(count==k){
                return entry.getKey();
            }
        }
     }
     return "";
    }
}