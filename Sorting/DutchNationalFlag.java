public class DutchNationalFlag
{
	public void dutchNationalFlag(int[] arr)
	{
		int i = 0;
		int j = 0;
		int k = arr.length - 1;

		while(i <=k)
		{
			if( arr[i] == 0)
			{
				swap(arr,i,j);
				i++;
				j++;
			}
			else if(arr[i] == 1)
			{
				i++;
			}
			else if(arr[i] == 2)
			{
				swap(arr,i,k);
				k--;
			}
		}
	}

	public void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
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
		int[] arr = {2,1,0,1,0,2,0,2,1};

		DutchNationalFlag is = new DutchNationalFlag();
		is.display(arr);
		is.dutchNationalFlag(arr);
		is.display(arr);
	}
}