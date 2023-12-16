public class Prog1
{
	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode
	{
		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data)
		{
			this.data = data;
		}
	}

	public Prog1()
	{
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty()
	{
		return length == 0;
	}

	public int length()
	{
		return length;
	}

	public void displayForward()
	{
		if(head == null)
		{
			return;
		}

		ListNode temp = head;

		while(temp != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

		System.out.print("null");
		System.out.println();
	}

	public void insertFirst(int value)
	{
		ListNode newNode = new ListNode(value);
		
		if(isEmpty())
		{
			tail = newNode;
		}
		else
		{
			head.previous = newNode;
		}
		
		newNode.next = head;
		head = newNode;
		length++;
	}

	public void displayBackward()
	{
		if(tail == null)
		{
			return;
		}

		ListNode temp = tail;

		while(temp != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.previous;
		}

		System.out.print("null");
		System.out.println();
	}

	public void insertLast(int value)
	{
		ListNode newNode = new ListNode(value);
		
		if(isEmpty())
		{
			head = newNode;
		}
		else
		{
			tail.next = newNode;
		}
		
		newNode.previous = tail;
		tail = newNode;
		length++;
	}

	public void deleteFirst()
	{
		if(isEmpty())
		{
			return;
		}

		ListNode temp = head;
		
		if(head == tail)
		{
			tail = null;
		}
		else
		{
			head.next.previous = null;
		}

		head = head.next;
		temp.next = null;
		length--;
	}

	public void deleteLast()
	{
		if(isEmpty())
		{
			return;
		}

		ListNode temp = tail;
		
		if(head == tail)
		{
			head = null;
		}
		else
		{
			tail.previous.next = null;
		}

		tail = tail.previous;
		temp.previous = null;
		length--;
	}


	public static void main(String[] args)
	{
		Prog1 p = new Prog1();
		p.insertFirst(1);
		p.displayForward();
		p.displayBackward();

		p.insertFirst(10);
		p.displayForward();
		p.displayBackward();

		p.insertLast(11);
		p.displayForward();
		p.displayBackward();

		p.insertLast(16);
		p.displayForward();
		p.displayBackward();

		p.deleteFirst();
		p.displayForward();
		p.displayBackward();

		p.deleteLast();
		p.displayForward();
		p.displayBackward();

	}


}