import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Prog1
{
	private TreeNode root;
	
	public class TreeNode
	{
		private int data;
		private TreeNode left;
		private TreeNode right;

		TreeNode(int data)
		{
			this.data = data;
		}
	}

	public void createBinaryTree()
	{
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(7);
		TreeNode sixth = new TreeNode(8);

		root = first;
		root.left = second;
		root.right = third;

		second.left = fourth;
		second.right = fifth;

		third.left = sixth;
	}

	public void preOrderRecursive(TreeNode root)
	{
		if(root == null)
		{
			return;
		}

		System.out.print(root.data + " ");

		preOrderRecursive(root.left);
		preOrderRecursive(root.right);
	}

	public void preOdrderIterative(TreeNode root)
	{
		if(root == null)
		{
			return;
		}

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while(!stack.isEmpty())
		{
			TreeNode temp = stack.pop();
		
			System.out.print(temp.data + " ");

			if(temp.right != null)
			{
				stack.push(temp.right);
			}

			if(temp.left != null)
			{
				stack.push(temp.left);
			}
		}
	}

	public void inOrderRecursive(TreeNode root)
	{
		if(root == null)
		{
			return;
		}

		inOrderRecursive(root.left);
		System.out.print(root.data);
		inOrderRecursive(root.right);
	}

	public void inOrderIteative(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
	
		while(!stack.isEmpty() || temp != null)
		{
			if( temp != null)
			{
				stack.push(temp);
				temp = temp.left;
			}
			else
			{
				temp = stack.pop();
				System.out.print(temp.data + " ");

				temp = temp.right;
			}
		}
	}

	public void postOrderRecursive(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		
		postOrderRecursive(root.left);
		postOrderRecursive(root.right);
		System.out.print(root.data);
	}

	public void postOrderIterative(TreeNode root)
	{
		if(root == null)
		{
			return;
		}

		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();

		while(!stack.isEmpty() || current != null)
		{
			if(current !=null)
			{
				stack.push(current);
				current = current.left;
			}
			else
			{
				TreeNode temp = stack.peek().right;

				if(temp == null)
				{
					temp = stack.pop();
					System.out.print(temp.data + " ");

					while(!stack.isEmpty() && temp == stack.peek().right)
					{
						temp = stack.pop();
						System.out.print(temp.data + " " );
					}
				}
				else
				{
					current = temp;
				}
			}
		}
	}

	public void levelOrder(TreeNode root)
	{
		if( root == null)
		{
			return;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while(!queue.isEmpty())
		{
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			
			if(temp.left != null)
			{
				queue.offer(temp.left);
			}
			
			if(temp.right != null)
			{
				queue.offer(temp.right);
			}
		}
	}

	public static void main(String[] args)
	{
		Prog1 p = new Prog1();
		p.createBinaryTree();
		p.preOrderRecursive(p.root);

		p.preOdrderIterative(p.root);

		System.out.println();
		p.inOrderRecursive(p.root);

		System.out.println();
		p.inOrderIteative(p.root);

		System.out.println();
		p.postOrderRecursive(p.root);

		System.out.println();
		p.postOrderIterative(p.root);

		System.out.println();
		p.levelOrder(p.root);
	}
}