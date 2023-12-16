public class Prog4
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
		Prog4 p = new Prog4();
		p.print();
		
		p.insert(1);
		p.print();

		p.insert(10);
		p.print();

		p.insert(11);
		p.print();

		p.insert(8);
		p.print();		
		
		
	}

	public void insert(int value)
	{
		ListNode newNode = new ListNode(value);

		if(head == null)
		{
			head = newNode;
			return;
		}

		ListNode current = head;

		while( null != current.next)
		{
			current = current.next;
		}

		current.next = newNode;
	}

	public void print()
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