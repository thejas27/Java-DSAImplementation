public class Prog12
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
		Prog12 p = new Prog12();
		p.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(11);
		ListNode fourth = new ListNode(8);

		p.head.next = second;
		second.next = third;
		third.next = fourth;

		System.out.println(p.find(3).data);
	}

	public ListNode find(int n)
	{
		if(head == null)
		{
			return null;
		}
		ListNode refPtr = head;
		ListNode mainPtr = head;
		int count = 0;

		while( count < n)
		{
			refPtr = refPtr.next;
			count++;
		}

		while(refPtr != null)
		{
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
}