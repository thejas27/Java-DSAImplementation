public class Prog10
{
	private ListNode head;

	private static class ListNode
	{
		private int data;
		private ListNode next;

		public ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args)
	{
		Prog10 p = new Prog10();
		p.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(11);
		ListNode fourth = new ListNode(8);

		p.head.next = second;
		second.next = third;
		third.next = fourth;
		p.display(p.head);
		ListNode reverseListHead = p.reverse(p.head);
		p.display(reverseListHead);

	}

	public ListNode reverse(ListNode head)
	{
		if(head == null)
		{
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while(current != null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		return previous;
	}

	public void display(ListNode head)
	{
		ListNode current = head;
		
		while(current != null)
		{
			System.out.print(current.data + " -> ");
			current = current.next;
		}

		System.out.print("null");
		System.out.println();
	}
}