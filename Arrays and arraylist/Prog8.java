public class Prog8
{
	public static void main(String[] args)
	{
		Prog8 p = new Prog8();
		int arr[] = {5, 9, 3, 10};
		p.printArray(arr);

		
		p.printArray(p.resize(arr, 8));
	}

	public void printArray(int[] arr)
	{
		for(int i = 0; i< arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

			System.out.println();
	}

	public int[] resize(int[] arr, int capacity)
	{
		int[] temp = new int[capacity];
		for(int i = 0; i < arr.length; i++)
		{
			temp[i] = arr[i];
		}
		arr = temp;

		return arr;
	}
}