public class DiameterofBinaryTree543 {
    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        helper(root);
        return result;
    }

    public int helper(TreeNode root) {
        if (root == null)
            return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        result = Math.max(result, left + right);
        return Math.max(left, right) + 1;
    }
}
