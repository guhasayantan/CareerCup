package Amazon.SDET;

public class CheckBalancedBinaryTree {
	class Node
	{

		int data;
		Node left, right;
		Node(int d)
		{
			this.data = d;
			this.left =null;
			this.right = null;
		}
	}
	public Node root;
	public static void main(String[] args) {
		
		CheckBalancedBinaryTree tree = new CheckBalancedBinaryTree();
        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(5);
        tree.root.left.left.left = tree.new Node(8);
        System.out.println(isBalancedBST(tree.root));
	}
    public static int findheight(Node node)
    {
    	if(node == null)
    		return 0;
    	else
    		return 1+ Math.max(findheight(node.right),findheight(node.left));
    }
    public static boolean isBalancedBST(Node node)
    {
    	if(node == null)
    		return false;
    	int leftht = findheight(node.left);
    	int rightht = findheight(node.right);
    	if(Math.abs(rightht-leftht)<=1 && isBalancedBST(node.left) && isBalancedBST(node.right))
    		return true;
    	else
    		return false;
    }
}
