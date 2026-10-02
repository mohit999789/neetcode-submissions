class Solution {
    public int maxProductDifference(int[] arr) {
      int lar=Integer.MIN_VALUE;  
      int secLar=Integer.MIN_VALUE;  
      int small=Integer.MAX_VALUE;  
      int secSmall=Integer.MAX_VALUE;  
      for(int a:arr){
        if(a>lar){
            secLar=lar;
            lar=a;
        }
       else if(a>secLar){
           secLar=a; 
        }
      }
      for(int a:arr){
        if(a<small){
            secSmall=small;
            small=a;
        }
        else if(a<secSmall){
           secSmall=a; 
        }
      }
      return (lar*secLar)-(small*secSmall);
    }
}