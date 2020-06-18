import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Test
 * @Author: 邹双双
 * Date: 2020/6/18 12:28
 * @Description:
 */

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}

public class Test {
    static List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root){
        if (root == null){
            return result;
        }
        help(root,0);
        return result;
    }

    private void help(TreeNode root, int i) {
        if (i == result.size()){
            result.add(new ArrayList<>());
        }
        result.get(i).add(root.val);
        if (root.left != null){
            help(root.left,i+1);
        }
        if (root.right != null){
            help(root.right,i+1);
        }
    }

}

