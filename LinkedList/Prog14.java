public class Prog14
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
		Prog14 p = new Prog14();
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
		p.insert(11);
		p.dislpay();
	}

	public ListNode insert(int value)
	{
		ListNode newNode = new ListNode(value);
		if(head == null)
		{
			return newNode;
		}
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data < newNode.data)
		{
			temp = current;
			current = current.next;
		}

		newNode.next = current;
		temp.next = newNode;
		return head;
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