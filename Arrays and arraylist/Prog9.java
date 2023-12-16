public class Prog9
{
	public static void main(String[] args)
	{
		Prog9 p = new Prog9();
		int[] arr = {2, 4, 1, 8, 6, 3, 7};

		System.out.println("Missing number is : " + p.missingNumber(arr));
	}

	public int missingNumber(int[] arr)
	{
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;

		for(int i : arr)
		{
			sum -= i;
		}
		
		return sum;
	}
}
