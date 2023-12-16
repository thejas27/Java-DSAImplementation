public class Prog6
{
	public static void main(String[] args)
	{
		Prog6 p = new Prog6();
		int[] arr = {13, 34, 2, 34, 33, 1};
		System.out.println("Second largest elemesnt : " + p.secondMaximum(arr));
	}

	public int secondMaximum(int[] arr)
	{
		if(arr == null || arr.length <= 0)
		{
			throw new IllegalArgumentException("Invalid Argument");
		}

		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				secMax = max;
				max = arr[i];
			}
			else if(arr[i] > secMax && arr[i] != max)
			{
				secMax = arr[i];
			}
		}
		
		return secMax;
	}
}