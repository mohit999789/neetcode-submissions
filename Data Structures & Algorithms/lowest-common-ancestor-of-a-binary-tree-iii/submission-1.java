/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
     Node p1=p,q1=q;
     while(p1!=q1){
        // p1=p1.next;
        // q1=q1.next;
        p1=(p1==null)?q:p1.parent;
        q1=(q1==null)?p:q1.parent;
     }
     return p1;
    }
}
/*
  //brute force
       //T.C. O(hp+hq)
       //S.C. O(hp+hq)
       Set<Node> set=new HashSet<>();
       while(p!=null){
        set.add(p);
        p=p.parent;
       }
       while(q!=null){
          if(set.contains(q)){
            return q;
          }
          q=q.parent;
       }
       return null;





*/