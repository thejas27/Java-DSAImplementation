public class SelectionSort
{
	public void selectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int min = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[min] < arr[j])
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
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

		SelectionSort is = new SelectionSort();
		is.display(arr);
		is.selectionSort(arr);
		is.display(arr);
	}
}