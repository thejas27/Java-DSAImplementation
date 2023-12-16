public class Prog1
{
	Integer[] heap;
	int n;

	public Prog1(int capacity)
	{
		heap = new Integer[capacity];
		n = 0;
	}

	public boolean isEmpty()
	{
		return n == 0;
	}

	public int size()
	{
		return n;
	}

	public void resize(int capacity)
	{
		Integer temp[] = new Integer[capacity];
		
		for(int i = 1; i < heap.length; i++)
		{
			temp[i] = heap[i];
		}

		heap = temp;
	}

	public void insert(int data)
	{
		if(n == heap.length - 1)
		{
			resize(heap.length * 2);
		}

		n++;
		heap[n] = data;
		swim(n);
	}

	public void swim(int k)
	{
		while( k > 1 && heap[k] > heap[k/2])
		{
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2; 
		}
	}

	public void display()
	{
		for(int i = 1; i <= n; i++)
		{
			System.out.print(heap[i] + " " );
		}
	}

	public int deleteMax()
	{
		int max = heap[1];
		swap(1,n);
		n--;
		sink(1);
		heap[n + 1] = null;
		if(n > 0 && (n == (heap.length - 1)/4))
		{
			resize(heap.length/2);
		}
		return max;
	}

	public void swap(int a, int b)
	{
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	
	public void sink(int k)
	{
		while( ((k * 2 <= n) || (k * 2 + 1 <= n)) && (heap[k] < heap [k * 2] || heap[k] < heap[k * 2 + 1]))
		{
			if(heap[k] < heap [k * 2])
			{
				swap(k, k * 2);
				k = k * 2;
			}
			else
			{
				swap(k, (k * 2 + 1));
				k = k * 2 + 1 ;
			}
		}
	}

	public static void main(String[] args)
	{
		Prog1 p = new Prog1(3);
		p.insert(9);
		p.insert(3);
		p.insert(6);
		p.insert(2);
		p.insert(1);
		p.insert(5);
		p.insert(4);
		p.display();

		System.out.println(p.deleteMax());
		p.display();
	}
}