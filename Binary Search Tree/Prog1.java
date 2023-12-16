import java.util.Stack;

public class Prog1
{
	private TreeNode root;
	
	private class TreeNode
	{
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data)
		{
			this.data = data;
		}
	}
	
	public void insert(int value)
	{
		root = insert(root,value);
	}

	public TreeNode insert(TreeNode root, int value)
	{
		if(root == null)
		{
			root = new TreeNode(value);
			return root;
		}

		if(value < root.data)
		{
			root.left = insert(root.left, value);
		}
		else
		{
			root.right = insert(root.right,value);
		}

		return root;
	}

	public void inOrder()
	{
		inOrder(root);
	}

	public void inOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}

		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
	
		while(!stack.isEmpty() || temp != null)
		{
			if(temp != null)
			{
				stack.push(temp);
				temp = temp.left;
			}
			else
			{
				temp = stack.pop();
				System.out.print(temp.data + " " );
				temp = temp.right;
			}
		}
	}

	public void inOrderR(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	
	}
	
	public boolean search(int key)
	{
		TreeNode result = search(root,key);
		
		if(result == null)
		{
			return false;
		} 
		else
		{
			return true;
		}
	}

	public TreeNode search(TreeNode root, int key)
	{
		if(root == null || root.data == key)
		{
			return root;
		}

		if(key < root.data)
		{
			return search(root.left, key);
		}
		else
		{
			return search(root.right, key);
		}
	}

	public void isValid()
	{
		boolean result = isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);

		if(result)
		System.out.println("Valid");
		else
		System.out.println("not Valid");
	}

	public boolean isValid(TreeNode root, long min, long max)
	{
		if(root == null)
		{
			return true;
		}

		if(root.data <= min || root.data >= max)
		{
			return false;
		}

		boolean left = isValid(root.left, min, root.data);

		if(left)
		{
			boolean right = isValid(root.right, root.data, max);
			return right;
		} 
		return false;
	}

	public static void main(String[] args)
	{
		Prog1 p = new Prog1();
		p.insert(7);
		p.insert(6);
		p.insert(0);
		p.insert(27);
		p.insert(1);
		p.insert(9);
		p.insert(2);
		p.insert(11);

		p.inOrder(p.root);
		p.inOrderR(p.root);

		System.out.println(p.search(27));
		System.out.println(p.search(2));
		System.out.println(p.search(10));

		p.isValid();
	}
}