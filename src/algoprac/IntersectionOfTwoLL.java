//package algoprac;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class IntersectionOfTwoLL {
//	/**
//	 * Definition for singly-linked list.
//	 * public class ListNode {
//	 *     int val;
//	 *     ListNode next;
//	 *     ListNode(int x) {
//	 *         val = x;
//	 *         next = null;
//	 *     }
//	 * }
//	 */
//	public class Solution {
//	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//	        ListNode cursor = headA;
//	        ListNode inter = null;
//	        while(cursor!=null){
//	            cursor.val = cursor.val *-1;
//	            cursor = cursor.next;
//	        }
//
//	        cursor =headB;
//
//	        while(cursor !=null){
//	            if(cursor.val<=0){
//	                inter = cursor;
//	                break;
//	            }
//	            cursor = cursor.next;
//	        }
//	        cursor = headA;
//	        while(cursor!=null){
//	            cursor.val *= -1;
//	            cursor= cursor.next;
//	        }
//
//	        return inter;
//	    }
//	}
//}