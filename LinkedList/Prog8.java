public class Prog8
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
		Prog8 p = new Prog8();
		p.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(11);
		ListNode fourth = new ListNode(11);

		p.head.next = second;
		second.next = third;
		third.next = fourth;

		p.print();
		p.delete(3);
		p.print();
		p.delete(1);
		p.print();
		p.delete(1);
		p.print();
	}

	public void print()
	{
		ListNode current = head;

		while(current != null)
		{
			System.out.print(current.data + "-> ");
			current = current.next;
		}

		System.out.print("null");
		System.out.println();
	}

	public void delete(int position)
	{
		if(position == 1)
		{
			head = head.next;
		}

		ListNode previous = head;
		int count = 1;

		while(count < position - 1)
		{
			previous = previous.next;
			count++;
		}
		
		ListNode current = previous.next;
		previous.next = current.next;
	}
}