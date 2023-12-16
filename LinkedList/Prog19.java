public class Prog19
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
		Prog19 p = new Prog19();
		p.a = new ListNode(1);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(10);
		ListNode fifth = new ListNode(16);

		p.a.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;


		p.b = new ListNode(3);
		ListNode second1 = new ListNode(5);
		ListNode third1 = new ListNode(9);
		ListNode fourth1 = new ListNode(15);
		ListNode fifth1 = new ListNode(17);

		p.b.next = second1;
		second1.next = third1;
		third1.next = fourth1;
		fourth1.next = fifth1;
		p.dislpay(p.b);
		p.dislpay(p.a);
		p.dislpay(p.merge(p.a,p.b));
		

	}

	public ListNode merge(ListNode a,ListNode b)
	{
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;

		while(a != null && b!= null)
		{
			if(a.data <= b.data)
			{
				tail.next = a;
				a = a.next;
			}
			else
			{
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}

		if(a == null)
		{
			tail.next = b;
		}
		else
		{
			tail.next = a;
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