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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode nextNode = head;
        while(l1 != null && l2 !=null){
            if(l1.val < l2.val){
                System.out.println(""+l1.val);
                nextNode.next = l1;
                l1 = l1.next;
            }
            else{
                System.out.println(""+l2.val);
                nextNode.next = l2;
                l2=l2.next;
            }
            nextNode = nextNode.next;
        }
        if(l2!=null){
            nextNode.next = l2;
        }
        else if (l1!= null){
            nextNode.next=l1;
        }
        else{
            return head.next;
        }
        return head.next;
    }
}