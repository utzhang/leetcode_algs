public class _21_mergeTwoLists {
	public static void main(String[] args) {

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode node1 = l1, node2 = l2, node3 = l3;

		while (node1 != null || node2 != null) {


			if (node1 == null) {
				node3.next = node2;
				break;
			}
			if (node2 == null) {
				node3.next = node1;
				break;
			}

			if (node1.val < node2.val) {
				node3.next = node1;
				node1 = node1.next;
			} else {
				node3.next = node2;
				node2 = node2.next;
			}

		}
		return l3.next;
	}

	public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  	}
}
