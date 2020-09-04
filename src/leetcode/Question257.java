package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhuda
 * @Description:
 * @Date: Create in 16:35 2020/9/4
 */
public class Question257 {
    public static void main(String[] args) {
        TreeNode oneNode = new TreeNode(1);
        TreeNode twoNode = new TreeNode(2);
        TreeNode threeNode = new TreeNode(3);
        TreeNode fourNode = new TreeNode(4);
        TreeNode fiveNode = new TreeNode(5);
        TreeNode sixNode = new TreeNode(6);
        oneNode.left = twoNode;
        oneNode.right = threeNode;
        twoNode.left = fourNode;
        twoNode.right = fiveNode;
        threeNode.left = sixNode;
        threeNode.right = null;
        fourNode.left = null;
        fourNode.right = null;
        fiveNode.left = null;
        fiveNode.right = null;
        System.out.println(binaryTreePaths(oneNode));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        goPath(root,"", paths);
        return paths;
    }

    private static void goPath(TreeNode root,String currentPath, List<String> paths) {
        if(root != null){
            StringBuffer path = new StringBuffer(currentPath);
            path.append(root.val);
            if (root.left == null && root.right == null) {
                paths.add(path.toString());
            }else{
                path.append("->");
                goPath(root.left,path.toString(), paths);
                goPath(root.right,path.toString(), paths);
            }
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
     }

}
