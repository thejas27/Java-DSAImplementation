class Prog1b
{
	public static void main(String[] args)
	{
		double now = System.currentTimeMillis();
		
		Prog1a p = new Prog1a();
		
		System.out.println(p.findSum(99999));

		System.out.println("Time taken is - " + (System.currentTimeMillis() - now) + " Millisecs");
	}

	public int findSum( int n)
	{
		int sum = 0;
		
		for(int i = 1; i <= n; i++)
		{
			sum += i;
		}
		return sum;
	}
}