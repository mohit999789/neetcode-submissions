class Solution {
    public boolean isMonotonic(int[] arr) {
        int n=arr.length;
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<n-1;i++){   //Checking if monotonically increasing or not
           if(arr[i]>arr[i+1]){
            inc=false;
           }
        }
         for(int i=0;i<n-1;i++){   //Checking if monotonically increasing or not
           if(arr[i]<arr[i+1]){   //Checking if monotonically decreasing or not
            dec=false;  
           }
        }
        return (inc==true || dec==true);
    }
}