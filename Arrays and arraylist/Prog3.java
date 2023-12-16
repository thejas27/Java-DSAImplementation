public class Prog3
{
	public static void main(String args[])
	{
		Prog3 p = new Prog3();
		int[] arr = {3, 2, 4, 7 , 10, 6, 5};
		p.print(p.removeEven(arr));
	}

	public void print(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int[] removeEven(int[] arr)
	{
		int oddCount = 0;
		for(int i =0; i < arr.length; i++)
		{
			if(arr[i] % 2 != 0)
			{
				oddCount++;
			}
		}

		int[] result = new int[oddCount];

		int idx = 0;

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 != 0)
			{
				result[idx] = arr[i];
				idx++;
			}
		}
		return result;
	}
}