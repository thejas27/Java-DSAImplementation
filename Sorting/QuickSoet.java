public class QuickSort
{
	public int partition(int arr[], int low, int high)
	{
		int pivot = high;
		int i = low;
		int j = low;
		while(i <= high)
		{
			if(arr[i] >= pivot)
			{
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
			i++;
		}
		return j-1;

	}

	public void sort(int[] arr, int low, int high)
	{
		int p = partition(arr,low,high);
		sort(arr,low,p-1);
		sort(arr,p+1,high);
	}

	public static void main(String[] args)
	{
		int[] arr = {1,4,3,6,7,4,2,8,9,3,5,6,17,7,8};
		

		QuickSort is = new QuickSort();
		is.display(arr);
		is.sort(arr,0,arr.length-1);
		is.display(arr);
	}
}