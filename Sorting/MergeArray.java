public class MergeArray
{
	public int[] mergeArray(int[] arr1, int[] arr2)
	{
		int[] result = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while( i < arr1.length && j < arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				result[k] = arr1[i];
				i++; 
			}
			else
			{
				result[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i < arr1.length)
		{
			result[k] = arr1[i];
			i++;
			k++;
		}

		while(j < arr2.length)
		{
			result[k] = arr2[j];
			j++;
			k++;
		}
		return result;
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
		int[] arr1 = {3,5,8,9,15};
		int[] arr2 = {1,4,6,7,12,19};
		MergeArray is = new MergeArray();
		is.display(arr1);
		is.display(arr2);
		
		is.display(is.mergeArray(arr1,arr2));
	}
}