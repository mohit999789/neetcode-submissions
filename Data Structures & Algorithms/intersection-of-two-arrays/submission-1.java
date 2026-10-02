class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        List<Integer>list=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        if(n1>n2){ 
          for(int a:arr1){
            set.add(a);
          }
          for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
            list.add(arr2[i]);
            set.remove(arr2[i]);
            }
          }
        }
        else{
          for(int a:arr2){
            set.add(a);
          }
          for(int i=0;i<arr1.length;i++){
            if(set.contains(arr1[i])){
                list.add(arr1[i]);
            set.remove(arr1[i]);
            }
          }
        }
        int ans[]=new int[list.size()];
        int j=0;
        while(j<list.size()){
            ans[j]=list.get(j);
            j++;
        }
        return ans;
    }
}