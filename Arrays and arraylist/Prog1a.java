class Prog1a
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
		return n * (n+1)/2;
	}
}