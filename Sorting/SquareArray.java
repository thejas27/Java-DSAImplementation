public class SquareArray
{
	public int[] sortSqaure(int[] arr)
	{
		int n = arr.length;
		int[] result = new int[n];
		int i = 0;
		int j = n-1;

		for(int k = n-1; k >=0; k--)
		{
			if((arr[i] * arr[i]) > (arr[j] * arr[j]))
			{
				result[k] = arr[i] * arr[i];
				i++;
			}
			else
			{
				result[k] = arr[j] * arr[j];
				j--;
			}
		}
		return result;
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
		SquareArray s = new SquareArray();
		int[] arr = {-4,-1,0,3,10};
		s.display(arr);
		
		s.display(s.sortSqaure(arr));
		
	}
}