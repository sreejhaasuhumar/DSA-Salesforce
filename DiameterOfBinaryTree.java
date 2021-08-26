package Salesforce;

import test.TreeNode;

public class DiameterOfBinaryTree {
static int max=0;
	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left =new TreeNode(2);
		root.right =new TreeNode(3);
		root.right.left=new TreeNode(5);
		root.left.right=new TreeNode(4);
		int ans=diameterOfBinaryTree(root);
		System.out.println(ans);
	}
	
	 public static int diameterOfBinaryTree(TreeNode root) {
	        maxDepth(root);
	        return max;
	    }
	    
	    private static int maxDepth(TreeNode root) {
	        if (root == null) return 0;
	        
	        int left = maxDepth(root.left);
	        int right = maxDepth(root.right);
	        
	        max = Math.max(max, left + right);
	        
	        return Math.max(left, right) + 1;
	    }
	
	

}
