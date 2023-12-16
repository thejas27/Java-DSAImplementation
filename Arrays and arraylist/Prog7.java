public class Prog7
{
	public static void main(String[] arga)
	{
		int[] arr = {8, 1, 0, 2, 1, 0, 3};
		Prog7 p = new Prog7();
		
		p.printArray(arr);
		p.moveZeros(arr);
		p.printArray(arr);
	}

	public void printArray(int[] arr)
	{
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

			System.out.println();
	}

	public void moveZeros(int[] arr)
	{
		int j = 0;

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != 0 && arr[j] == 0)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		
			if(arr[j] !=0)
			{
				j++;
			}
		}
	}
}