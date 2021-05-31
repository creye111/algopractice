package algoprac;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        boolean aEmpty = false;
        boolean bEmpty = false;
        while(headA!null&&headB!=null){
            if(headA.next!=null){
                headA = headA.next;
            }else{
                aEmpty = true;
                break;
            }
            if(headB.next!=null){
                headB = headB.next;
            }
            else{
                bEmpty=true;
                break;
            }
        }   
        if(aEmpty&&bEmpty){
            
        }else if(aEmpty && !bEmpty){
            
        }else if(!aEmpty &&bEmpty){
            
        }
    }
}