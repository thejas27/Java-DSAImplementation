public class Prog2
{
	public void printArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		Prog2 p = new Prog2();
		p.myArray();
	}

	public void myArray()
	{
		int[] arr = new int[5];
		printArray(arr);

		arr[1] = 1;
		arr[0] = 5;
		arr[2] = 8;
		arr[3] = 2;
		arr[4] = 10;
		printArray(arr);
		arr[2] = 9;

		printArray(arr);
	}
}