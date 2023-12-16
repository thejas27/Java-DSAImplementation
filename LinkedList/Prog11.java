public class Prog11
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
		Prog11 p = new Prog11();
		p.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(11);
		ListNode fourth = new ListNode(8);

		p.head.next = second;
		second.next = third;
		third.next = fourth;

		System.out.println(p.findMiddle().data);
	}

	public ListNode findMiddle()
	{
		if(head == null)
		{
			return null;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while(fastPtr != null && fastPtr.next != null)
		{
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		return slowPtr;
	}
}