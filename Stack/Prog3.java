import java.util.Stack;
import java.util.Scanner;

public class Prog3
{
	public static String reverse(String str)
	{
		Stack<Character> stack = new Stack<>();
		char[] chars = str.toCharArray();
		
		for(char ch : chars)
		{
			stack.push(ch);
		}

		for(int i = 0; i < str.length(); i++)
		{
			chars[i] = stack.pop();
		}

		return new String(chars);
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		String str = scan.nextLine();

		System.out.println("reversed string is : " + reverse(str));
	}
}