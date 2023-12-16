public class BubbleSort{
	
	public void bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			int flag = 0;
			for(int j = 0; j< arr.length - 1 - i; j++)
			{
				if(arr[j] < arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
			{
				break;
			}
		}
	}

	public void display(int[] arr)
	{
		for(int i =0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args)
	{
		int arr[] = {4,3,5,6,2,6,7,8,2,1,2};
		BubbleSort b =  new BubbleSort();

		b.display(arr);
		b.bubbleSort(arr);
		b.display(arr);
	}
}