public class Prog5
{
	public static void main(String[] args)
	{
		Prog5 p = new Prog5();
		int arr[] = {5, 9, 3, 15, 1, 2};
		System.out.println("Min value is : " + p.findMinimum(arr));
	}

	public int findMinimum(int[] arr)
	{
		if(arr == null || arr.length == 0)
		{
			throw new IllegalArgumentException("Invalid Input");
		}
		int min = arr[0];
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		} 
		return min;
	}
}