//package algoprac;
//
//public class LinkedListCyle {
//	public boolean hasCycle(ListNode head) {
//
//        ListNode start = head;
//        ListNode p = null;
//        ListNode q = null;
//        if(head==null||head.next ==null || head.next.next == null)
//            return false;
//        else{
//            p = head.next.next;
//            q = head.next;
//        }
//        if(p==q){
//            return true;
//        }
//
//        while(p!=null && p.next !=null){
//            p=p.next.next;
//            q=q.next;
//            if(p==q){
//                return true;
//            }
//        }
//        return false;
//    }
//}
