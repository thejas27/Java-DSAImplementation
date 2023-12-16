public class Prog2
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
		Prog2 p = new Prog2();
		p.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);

		p.head.next = second;
		second.next = third;
		third.next = fourth;

		System.out.println("Length is : " + p.length());
	}

	public int length()
	{
		int count = 0;
		ListNode current = head;
	
		while(current != null)
		{
			count++;
			current = current.next;
		}
		
		return count;
	}
}