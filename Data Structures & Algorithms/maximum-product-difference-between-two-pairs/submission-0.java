class Solution {
    public int maxProductDifference(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int w=arr[0];
        int x=arr[1];
        int y=arr[n-1];
        int z=arr[n-2];
        return (y*z)-(w*x);
    }
}