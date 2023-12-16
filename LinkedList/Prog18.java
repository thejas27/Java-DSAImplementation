public class Prog18
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
		Prog18 p = new Prog18();
		p.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(10);
		ListNode fifth = new ListNode(16);

		p.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = second;
		p.isLoop();
		p.dislpay();
		

	}

	public void isLoop()
	{
		if(head == null)
		{
			return ;
		}
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr != null && fastPtr.next != null)
		{
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;

			if( slowPtr == fastPtr)
			{
				removeLoop(slowPtr);
				return;
			}
		}

		return;
	}

	public void removeLoop(ListNode slowPtr)
	{
		ListNode temp = head;
		
		while(slowPtr.next != temp.next )
		{
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
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