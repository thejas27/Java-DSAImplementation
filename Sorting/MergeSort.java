public class MergeSort
{
	public void divide(int[] arr, int[] temp, int low, int high)
	{
		if( low < high)
		{
			int mid = low + (high - low)/2;

			divide(arr,temp, low, mid);
			divide(arr,temp,mid + 1, high);
			merge(arr,temp,low,mid,high);
		}
	}

	public void merge(int[] arr,int[] temp,int low, int mid, int high)
	{
		for(int i = low; i <= high; i++)
		{
			temp[i] = arr[i];
		}

		int i = low;
		int j = mid + 1;
		int k = low;

		while(i <= mid && j <= high)
		{
			if(temp[i] <= temp[j])
			{
				arr[k] = temp[i];
				i++;
			}
			else
			{
				arr[k] = temp[j];
				j++;
			}
			k++;
			
		}

		while(i <= mid)
		{
			arr[k] = temp[i];
			i++;
			k++;
		}

		while(j <= high)
		{
			arr[k] = temp[j];
			j++;
			k++;
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
		int[] temp = new int[arr.length];

		MergeSort is = new MergeSort();
		is.display(arr);
		is.divide(arr,temp,0,arr.length-1);
		is.display(arr);
	}
}