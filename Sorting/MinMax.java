public class MinMax
{
	public void arrangeMaxMin(int[] arr)
	{
		int maxIdx = arr.length - 1;
		int minIdx = 0;
		int max = arr[maxIdx] + 1;

		for(int i = 0; i < arr.length; i++)
		{
			if( i % 2 == 0)
			{
				arr[i] = arr[i] + ((arr[maxIdx] % max) * max);
				maxIdx--; 
			}
			else
			{
				arr[i] = arr[i] + ((arr[minIdx] % max) * max);
				minIdx++; 
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = arr[i]/max;
		}
	}

	public void display(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args)
	{
		MinMax m = new MinMax();
		int arr[] = {1, 3, 5, 7, 9, 15};

		m.display(arr);
		m.arrangeMaxMin(arr);
		m.display(arr);
		
	}
}