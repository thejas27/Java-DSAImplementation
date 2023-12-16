public class Test
{
	public int divide(int[] arr, int low, int high)
	{
		if(low < high)
		{
			int pivot = arr[ high];
			
			int  i = low;
			int j = high;
		
			while( i <= j)
			{
				if(arr[i] > pivot)
				{
				}
			}
		}
	}

	public void display(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
			System.out.println();
	}

	public static void main(String[] args)
	{
		Test t = new Test();
		int[] arr = {4,7,2,7,9,1,4,3,6,5,8,0};
		t.display(arr);
		t.divide(arr, 0, arr.length - 1);
		t.display(arr);
	}
}