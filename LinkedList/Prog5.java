public class Prog5
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
		Prog5 p = new Prog5();
		
		p.head = new ListNode(10);
		ListNode second = new ListNode(1);

		p.head.next = second;

		p.print();

		p.insert(8,1);
		p.print();
		p.insert(7,3);
		p.print();
		p.insert(5,5);
		p.print();
	}

	public void insert(int value, int position)
	{
		ListNode newNode = new ListNode(value);

		if(position == 1)
		{
			newNode.next = head;
			head = newNode;
		}
		else
		{
			ListNode previous = head;
			int count = 1;
			
			while(count < position - 1)
			{
				previous = previous.next;
				count++;
			}

			ListNode current = previous.next;
			newNode.next = current;
			previous.next = newNode;
		}
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