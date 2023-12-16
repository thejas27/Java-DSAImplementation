import java.lang.Exception;
public class Prog1
{
	private ListNode top;
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
		top = null;
		length = 0;
	}

	public int length()
	{
		return length;
	}

	public boolean isEmpty()
	{
		return length == 0;
	}

	public void push(int data)
	{
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}

	public int pop()
	{
		if(isEmpty())
		{
			return -1;
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}

	public int peek()
	{
		if(isEmpty())
		{
			return -1;
		}
		return top.data;
	}

	public static void main(String[] args)
	{
		Prog1 p = new Prog1();
		p.push(10);
		System.out.println(p.peek());
		p.push(15);
		System.out.println(p.peek());
		p.push(20);
		System.out.println(p.peek());

		p.pop();
		System.out.println(p.peek());
		p.pop();
		System.out.println(p.peek());
	}
}