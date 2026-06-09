/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummy=new ListNode(0);
       dummy.next=head;
        ListNode f=dummy;
        ListNode s=dummy;
        while(n>0){
          f=f.next;
          n--;
        }
         while(f!=null && f.next!=null){
          s=s.next;
          f=f.next;
        }
        if(s.next==null){
           return null;
        }
        s.next=s.next.next;
        return dummy.next;
    }
}
