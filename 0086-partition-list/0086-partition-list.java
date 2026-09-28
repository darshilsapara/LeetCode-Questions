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
    public ListNode partition(ListNode head, int x) {
        ListNode lessd=new ListNode(0);
        ListNode greaterd=new ListNode(0);
        ListNode less= lessd;
        ListNode greater= greaterd;
        ListNode current=head;
        while(current!=null){
            if(current.val<x){
                less.next=current;
                less=less.next;
            }
            else{
                greater.next=current;
                greater=greater.next;
            }
            current=current.next;
        }
        greater.next=null;
        less.next=greaterd.next;
        return lessd.next;
        

        
    }
}