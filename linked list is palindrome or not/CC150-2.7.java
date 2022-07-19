public class Main {

	private class Result {
		boolean isSame;
		ListNode node;

		public Result(boolean isSame, ListNode node) {
			this.isSame = isSame;
			this.node = node;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main so = new Main();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		a.next = b;
		System.out.println(so.isPalindrome(a));
	}

	private boolean isPalindrome(ListNode head) {
		// TODO Auto-generated method stub
		if (head == null)
			return false;
		if (head.next == null)
			return true;
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Result rs = isPalindromeRecursive(head, slow);
		if (!rs.isSame)
			return false;
		return true;
	}

	private Result isPalindromeRecursive(ListNode head, ListNode slow) {
		// TODO Auto-generated method stub
		if (slow.next == null) {
			return new Result(head.val == slow.val, head.next);
		}
		Result rs = isPalindromeRecursive(head, slow.next);
		if (!rs.isSame)
			return rs;
		if (rs.node.val == slow.val)
			rs.node = rs.node.next;
		else
			rs.isSame = false;
		return rs;
	}
}