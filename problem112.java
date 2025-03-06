import javax.swing.tree.TreeNode;

public class problem112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            return root.val==targetSum;
        }
        int remainingSum=targetSum-root.val;
        return hasPathSum(root.left,remainingSum) || hasPathSum(root.right,remainingSum);
    }
}
