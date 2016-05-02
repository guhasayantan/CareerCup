package Amazon.QAE;


class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int d)
	{
		this.data =d;
		this.left=null;
		this.right=null;
	}
}
public class CheckBST {
	
	static TreeNode root;
	public boolean isBST(TreeNode node)
	{
		
		if(node==null)
		{
			return true;
		}
		else if((node.left!=null&&node.left.data > node.data) || (node.right!=null&&node.right.data <  node.data))
		{
			return false;
		}
		else
		{
			return(isBST(node.left)&&isBST(node.right));
		}
	}
	void insertNode(int data)
	{
		TreeNode newnode = new TreeNode(data);
		if(root==null)
		{
			root = newnode;
		}
		else
		{
			TreeNode focusnode = root;
			TreeNode parent;
			while(true)
			{	
				parent = focusnode;
				if(data < focusnode.data)
				{
					focusnode = focusnode.left;
					if(focusnode ==  null){
						parent.left = newnode;
						return;
					}
				}
				else
				{
					focusnode = focusnode.right;
					if(focusnode ==  null){
						parent.right = newnode;
						return;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		CheckBST bst = new CheckBST();
		bst.insertNode(10);
		bst.insertNode(4);
		bst.insertNode(5);
		bst.insertNode(6);
		bst.insertNode(7);
		bst.insertNode(9);
		System.out.println("IS the tree BST:"+ bst.isBST(root));
	}

}
