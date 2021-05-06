package algoprac;

public class MergeSortedLists {
	public class ListNode {
		public int val;
		public ListNode next=null;
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
		public ListNode() {
		}
	}
	public ListNode mergeSortLists(ListNode list1, ListNode list2) {
		ListNode resList = new ListNode();
		ListNode head = new ListNode();
		int counter =0;
		while(list1.next != null&&list2.next!=null) {
			if(counter==0){
				if (list1.val<list2.val) {	
					resList =list1;
					list1 = list1.next;
				}else if (list1.val>list2.val) {
					resList = list2;
					list2= list2.next;
				}else {
					resList =list1;
					list1 = list1.next;
				}
			}
			else {
				if (list1.val<list2.val) {	
					resList.next =list1;
					list1 = list1.next;
					resList = resList.next;
				}else if (list1.val>list2.val) {
					resList.next = list2;
					list2= list2.next;
				}else {
					resList.next =list1;
					list1 = list1.next;
					resList = resList.next;
				}
			}
			counter++;
		}
		if(list1.next ==null) {
			
		} else if (list2.next==null) {
			
		}
		else {
			
		}
		return resList;
	}
}
