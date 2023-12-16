public class Prog6
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
		Prog6 p = new Prog6();
		p.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);

		p.head.next = second;
		second.next = third;
	
		p.dislpay();
		System.out.println("deleted node : " + p.delete().data);

		p.dislpay();
		System.out.println("deleted node : " + p.delete().data);

		p.dislpay();
		System.out.println("deleted node : " + p.delete().data);

		p.dislpay();
		System.out.println("deleted node : " + p.delete());
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

	public ListNode delete()
	{
		if(head == null)
		{
			return null;
		}

		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
}