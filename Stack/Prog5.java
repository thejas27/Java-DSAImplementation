import java.util.*;

public class Prog5
{
	public static boolean validParentheses(String str)
	{
		Stack<Character> stack = new Stack<>();

		for(char ch : str.toCharArray())
		{
			if(ch == '(' || ch == '[' || ch == '{')
			{
				stack.push(ch);
			} 
			else
			{
				if(stack.isEmpty())
				{
					return false;
				}
				else
				{
					char top = stack.peek();
					if((ch == ')' && top == '(') ||
					   (ch == ']' && top == '[') ||
					   (ch == '}' && top == '{'))
					{
						stack.pop();
					}
					else
					{
						return false;
					}
				}

			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the parentheses");
		String str = scan.next();

		if(validParentheses(str))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("InValid");
		}
	}
}