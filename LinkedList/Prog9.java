public class Prog9
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
		Prog9 p = new Prog9();
		p.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(11);
		ListNode fourth = new ListNode(8);

		p.head.next = second;
		second.next = third;
		third.next = fourth;

		System.out.println(p.find(1));

		System.out.println(p.find(12));


	}

  public boolean find(int searchKey) {
      if (head == null) {
         return false;
      }

      ListNode current = head;
      while (current != null) {
         if (current.data == searchKey) {
            return true;
         }
         current = current.next;
      }
      return false;
   }
}