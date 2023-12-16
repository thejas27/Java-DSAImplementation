public class Prog2
{
	public void search(int[][] matrix, int n, int x)
	{
		int i = 0;
		int j = n - 1;
		
		while(i < n && j >= 0)
		{
			if(matrix[i][j] == x)
			{
				System.out.println(x + " is found at " + i + ", " + j);
				return;
			}
			else if(matrix[i][j] > x)
			{
				j--;
			}
			else
			{
				i++;
			}
		}
		System.err.print("NOT FOUND");
	}

	public static void main(String[] args)
	{
		int[][] matrix = {
				  {10,20,30,40},
				  {15,25,35,45},
				  {17,29,37,48},
				  {32,33,39,51}
				 };

		Prog2 p = new Prog2();
		p.search(matrix, 4, 32);
		p.search(matrix, 4, 100);
	}
}