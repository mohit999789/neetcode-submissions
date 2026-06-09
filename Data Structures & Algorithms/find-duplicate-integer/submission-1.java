class Solution {
    public int findDuplicate(int[] arr) {
        //brute force
        int temp=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
          if(set.contains(arr[i])){
            temp= arr[i];
            break;
          }
          else{
            set.add(arr[i]);
          }
        }
       return temp;   
    }
}
