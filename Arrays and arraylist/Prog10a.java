public class Prog10a
{
	public static void main(String[] args)
	{
		Prog10a p = new Prog10a();
		
		System.out.println(p.isPalindrome("that"));
	}

	public boolean isPalindrome(String value)
	{
		String reverse ="";
		for(int i = 0; i < value.length(); i++)
		{
			reverse = value.charAt(i) + reverse;
		}

		if( reverse.equals(value))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}