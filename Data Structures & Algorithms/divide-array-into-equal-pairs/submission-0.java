class Solution {
    public boolean divideArray(int []arr) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        int pair=0;
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
           if(entry.getValue()%2==0){
            pair+=entry.getValue()/2;
           }
        }
        return pair*2==arr.length;
    }
}