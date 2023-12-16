public class Prog3
{
	public void spiral(int[][] matrix, int c, int r)
	{
		int i;
		int k = 0, l = 0;

		while( k < r && l < c)
		{
			for( i = l; i < c ; i++)
			{
				System.out.print(matrix[k][i] + " ");
			}
			k++;

			for( i = k; i < r; i++)
			{
				System.out.print(matrix[i][c - 1] + " ");
			}
			c--;

			if( k < r)
			{
				for( i = c - 1; i >= l ; i--)
				{
					System.out.print(matrix[r - 1][i] + " ");
				}
				r--;	
			}

			if( l < c)
			{
				for(i = r - 1; i >= k; i--)
				{
					System.out.print(matrix[i][l] + " ");
				}
				l++;
			}
		}
	}

	public static void main(String[] args)
	{
		int[][] matrix = {
				  {1,2,3,4},
				  {5,6,7,8},
				  {9,10,11,12},
				  {13,14,15,16}
				 };

		Prog3 p = new Prog3();
		p.spiral(matrix, 4,4);
	}
}