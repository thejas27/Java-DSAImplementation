public class Prog7
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
		Prog7 p = new Prog7();
		p.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(11);

		p.head.next = second;
		second.next = third;

		p.print();
		System.out.println("deleted value is : " + p.delete().data);
		p.print();
		System.out.println("deleted value is : " + p.delete().data);
		p.print();
		System.out.println("deleted value is : " + p.delete().data);
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

	public ListNode delete()
	{
		if( head == null || head.next == null)
		{
			return head;
		}

		ListNode current = head;
		ListNode previous = null;

		while(current.next != null)
		{
			previous = current;
			current = current.next;
		}

		previous.next = null;
		return current;
	}
}