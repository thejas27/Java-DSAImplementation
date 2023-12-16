import java.lang.*;

public class Prog2
{
	private int top;
	private int[] arr;

	public Prog2(int capacity)
	{
		top = -1;
		arr = new int[capacity];
	}

	public Prog2()
	{
		this(10);
	}

	public int size()
	{
		return (top + 1);
	}

	public boolean isFull()
	{
		return arr.length == size();
	}

	public void push(int data)
	{
		if(isFull())
		{
			throw new RuntimeException("Stack is full");
		}

		top++;
		arr[top] = data;
	}

	public int pop()
	{
		if(top < 0)
		{
			throw new RuntimeException("Stack is empty");
		}

		int result = arr[top];
		top--;
		return result;
	}

	public int peek()
	{
		if(top < 0)
		{
			throw new RuntimeException("Stack is empty");
		}
		return arr[top];
	}

	public static void main(String[] args)
	{
		Prog2 p = new Prog2(3);
		p.push(8);
		System.out.println(p.peek());
		p.push(4);
		System.out.println(p.peek());
		p.push(3);
		System.out.println(p.peek());
		
		System.out.println(p.pop());

	}
}