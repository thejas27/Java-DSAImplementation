public class Prog20
{
	private ListNode a;
	private ListNode b;

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
		Prog20 p = new Prog20();
		p.a = new ListNode(7);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(9);

		p.a.next = second;
		second.next = third;


		p.b = new ListNode(5);
		ListNode second1 = new ListNode(6);

		p.b.next = second1;
		p.dislpay(p.b);
		p.dislpay(p.a);
		p.dislpay(p.add(p.a,p.b));
		

	}

	public ListNode add(ListNode a,ListNode b)
	{
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry = 0;
		
		while(a != null || b != null)
		{
			int x = (a != null) ? a.data : 0;
			int y = (b != null) ? b.data : 0;
			int sum = carry + x + y;
			carry = sum / 10;

			tail.next = new ListNode(sum % 10);
			tail = tail.next;

			if(a != null) a = a.next;
			if(b != null) b = b.next;
		}

		if(carry > 0)
		{
			tail.next = new ListNode(carry);
		}

		return dummy.next;
	}

	public void dislpay(ListNode head)
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