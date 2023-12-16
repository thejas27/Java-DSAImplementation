public class Prog2
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
		TreeNode fifth = new TreeNode(27);
		TreeNode sixth = new TreeNode(18);

		root = first;
		root.left = second;
		root.right = third;

		second.left = fourth;
		second.right = fifth;

		third.left = sixth;
	}

	public int findMax(TreeNode root)
	{
		if(root == null)
		{
			return Integer.MIN_VALUE;
		}

		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);

		if( left > result)
		{
			result = left;
		}

		if(right > result)
		{
			result = right;
		}

		return result;
	}

		public static void main(String[] args)
	{
		Prog2 p = new Prog2();
		p.createBinaryTree();

		System.out.println(p.findMax(p.root));
	}
}