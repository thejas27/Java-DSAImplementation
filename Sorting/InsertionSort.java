public class InsertionSort
{
	public void insertionSort(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int temp = arr[i];
			int j = i;
			while(j > 0 && arr[j-1] < temp )
			{
				arr[j] = arr[j-1];
				j--;
				
			}
			arr[j] = temp; 

			
		}
	}

	public void display(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args)
	{
		int[] arr = {1,4,3,6,7,4,2,8,9,3,5,6,17,7,8};

		InsertionSort is = new InsertionSort();
		is.display(arr);
		is.insertionSort(arr);
		is.display(arr);
	}
}