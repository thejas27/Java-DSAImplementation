public class Prog1
{
	private ListNode last;
	private int length;

	private class ListNode
	{
		private int data;
		private ListNode next;

		public ListNode(int data)
		{
			this.data = data;
		}
	}

	public Prog1()
	{
		last = null;
		length = 0;
	}

	public boolean isEmpty()
	{
		return length == 0;
	}

	public int length()
	{
		return length;
	}

	public void display()
	{
		if(last == null)
		{
			System.out.println("Empty");
			return;
		}

		ListNode first = last.next;

		while(first != last)
		{
			System.out.print(first.data + " ");
			first = first.next;
		}

		System.out.print(first.data + " ");
		System.out.println();
	}

	public void insertFirst(int value)
	{
		ListNode newNode = new ListNode(value);

		if(last == null)
		{
			last = newNode;
		}
		else
		{
			newNode.next = last.next;
		}
		
		last.next = newNode;
		length++;
	}

	public void insertLast(int value)
	{
		ListNode newNode = new ListNode(value);

		if(last == null)
		{
			last = newNode;
		}
		else
		{
			newNode.next = last.next;
		}
		
		last.next = newNode;
		last = last.next;
		length++;
	}

	public void removeFirst()
	{
		if(isEmpty())
		{
			System.out.println("Empty");
		}

		if(last == last.next)
		{
			last = null;
		}
		else
		{
			ListNode temp = last.next;
			last.next = temp.next;
			temp.next = null;
		}
	}

	public static void main(String[] args)
	{
		Prog1 p = new Prog1();

		p.insertLast(27);
		p.display();

		p.insertFirst(10);
		p.display();

		p.insertFirst(1);
		p.display();

		p.removeFirst();
		p.display();

		p.removeFirst();
		p.display();

		p.removeFirst();
		p.display();
	}
}