package lc.daily.december;

public class Dec8 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
		    this.val = val;
		    this.left = left;
		    this.right = right;
		}
	}
	
	public static String tree2str(TreeNode root) {
	       StringBuilder res = new StringBuilder();
	       preOrder(root, res);
	       res.deleteCharAt(0);
	       res.deleteCharAt(res.length() - 1);
	       return res.toString();
	    }
	 
	 private static void preOrder(TreeNode root, StringBuilder res){
	        if (root==null)
	            return;
	        res.append("(");
	        res.append(root.val);
	        preOrder(root.left, res);
	        if(root.left == null && root.right!=null) {
	        	res.append("()");
	        }
	        preOrder(root.right,res);
	        res.append(")");
	    }
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
		System.out.println("Tree made successfully!!");
		System.out.println(tree2str(t1));
	}

}
