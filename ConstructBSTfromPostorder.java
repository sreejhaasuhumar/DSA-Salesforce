package Salesforce;

import test.TreeNode;

public class ConstructBSTfromPostorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] postorder = { 8, 12, 10, 16, 25, 20, 15 };
		TreeNode node=constructBST(postorder,0,postorder.length-1);
		System.out.println(node);
	}

	public static TreeNode constructBST(int[] a,int start,int end) {
		
		if(start>end)
			return null;
		
		TreeNode node=new TreeNode(a[end]);
		
		int i=0;
		for(i=end;i>=start;i--)
		{
			if(a[i]<node.val)
				break;
		}
		
		node.right=constructBST(a,i+1,end);
		node.left=constructBST(a,start,i);
		
		return node;

		
		
	}
}
