public class Prog17
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
		Prog17 p = new Prog17();
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
		System.out.println("Starting point is " + p.isLoop().data);
		

	}

	public ListNode isLoop()
	{
		if(head == null)
		{
			return null;
		}
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr != null && fastPtr.next != null)
		{
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;

			if( slowPtr == fastPtr)
			{
				return getStartingNode(slowPtr);
			}
		}

		return null;
	}

	public ListNode getStartingNode(ListNode slowPtr)
	{
		ListNode temp = head;
		
		while(temp != slowPtr)
		{
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp;
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