class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int currCount=1;
         int maxCount=1;
        for(int i=0;i<arr.length-1;i++){
             if (arr[i] == arr[i + 1]) {
                continue;
            }
            // int temp=Math.abs(arr[i+1]-arr/[i]);
            if(arr[i]+1==arr[i+1]){
                currCount++;
            }
              else {
                maxCount = Math.max(maxCount, currCount);
                currCount = 1;
            }
        }
        return Math.max(maxCount, currCount);
    }
}
