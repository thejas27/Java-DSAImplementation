public class Prog15
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
		Prog15 p = new Prog15();
		p.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(10);
		ListNode fifth = new ListNode(16);

		p.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		p.dislpay();
		p.remove(10);
		p.dislpay();
	}

	public void remove(int key)
	{
		if(head == null)
		{
			return;
		}
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data != key)
		{
			temp = current;
			current = current.next;
		}

		if(current == null)
		{
			return;
		}
		temp.next = current.next;
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