/*
import java.util.ArrayList;
import java.util.List;


 // Definition for a binary tree node.
  /private class TreeNode {
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
class LevelOrderBinaryTree {
    public List<List<Integer>> levelOrder(TreeNode root) {
        int height = height(root);
        List<List<Integer>> levels = new ArrayList<>();

        for(int i=1; i<=height; i++) {
            levels.add(getLevels(root, i));
        }

        return levels;
    }

    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }
        else {
            int lefth = height(root.left);
            int righth = height(root.right);

            if(lefth > righth)
                return lefth + 1;
            else
                return righth + 1;
        }
    }

    public List<Integer> getLevels(TreeNode root, int level) {
        List<Integer> levels = new ArrayList<>();
        levels.add(getLevelNode(root, level));

        return levels;
    }

    public int getLevelNode(TreeNode root, int level) {
        int val = 0;

        if(root == null) {
            return 0;
        } else if(level == 1) {
            return root.val;
        } else {
            getLevelNode(root.left, level-1);
            getLevelNode(root.right, level-1);
        }

        return val;
    }

}
*/
