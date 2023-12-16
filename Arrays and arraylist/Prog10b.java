public class Prog10b
{
	public static void main(String[] args)
	{
		Prog10b p = new Prog10b();
		
		System.out.println(p.isPalindrome("madam"));
	}

	public boolean isPalindrome(String value)
	{
		char[] charArray = value.toCharArray();
		int start = 0;
		int end = value.length() - 1;

		while(start < end)
		{
			if(charArray[start] != charArray[end])
			{
				return false;
			}

			start++;
			end--;
		}
		
		return true;
	}
}