public class Prog13
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
		Prog13 p = new Prog13();
		p.head = new ListNode(1);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(2);
		ListNode fourth = new ListNode(3);
		ListNode fifth = new ListNode(3);

		p.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		p.dislpay();
		p.duplicate();
		p.dislpay();
	}

	public void duplicate()
	{
		ListNode current = head;

		while(current != null && current.next != null)
		{
			if(current.data == current.next.data)
			{
				current.next = current.next.next;
			}
			else
			{
				current = current.next;
			}
		}
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