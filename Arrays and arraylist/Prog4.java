public class Prog4
{
	public static void main(String[] args)
	{
		Prog4 p = new Prog4();

		int arr[] = {2, 11, 5, 10, 7, 8};
		p.print(arr);

		p.reverseArray(arr,0, arr.length - 1);
		p.print(arr);
	}

	public void print(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	public void reverseArray(int[] arr, int start, int end)
	{
		while(start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}