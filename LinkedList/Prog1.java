public class Prog1
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

	public static void main(String args[])
	{
		Prog1 p = new Prog1();
		p.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);

		p.head.next = second;
		second.next = third;
		third.next = fourth;
	
		p.dislpay();
	}

	public void dislpay()
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