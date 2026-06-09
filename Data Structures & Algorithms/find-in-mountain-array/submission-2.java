/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        if(mountainArr.length()<3){
            return -1;
        }
      int low=0;int high=mountainArr.length()-1;
      int mid=0;
      while(low<high){
         mid=low+(high-low)/2;
        if(mountainArr.get(mid)<mountainArr.get(mid+1)){
            low=mid+1;
        }
        else{
          high=mid;  
        }
      }
      
       int peak=low;
       int copy=peak+1;
        low=0;
    while(low<=peak){
         mid=low+(peak-low)/2;
        if(mountainArr.get(mid)==target){
           return mid;
        }
        else if(mountainArr.get(mid)>target){
            peak=mid-1;
        }
        else{
            low=mid+1;
         }
    }
    high=mountainArr.length()-1;
     while(copy<=high){
        mid=copy+(high-copy)/2; 
        if(mountainArr.get(mid)==target){
            return mid;
        }
        else if(mountainArr.get(mid)>target){
            copy=mid+1;
           
        }
        else{
          high=mid-1;   
        }
     }
     return -1;
    }
}