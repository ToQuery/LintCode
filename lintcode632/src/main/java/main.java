/**
 * @author ToQuery
 * @version 1.0
 * @date 17-4-10.
 */
public class main {
    public static void main(String[] s) {
        TreeNode treeNode = initTreeNode();
        Integer integer = getMaxNum(treeNode, treeNode.getCurrtObj());
        System.out.println(integer);
    }

    private static Integer getMaxNum(TreeNode treeNode, int maxNum) {
        if (treeNode == null) {
            return maxNum;
        }
        if (maxNum < treeNode.getCurrtObj()) {
            maxNum = treeNode.getCurrtObj();
        }
        return getMaxNum(treeNode.getLeftChild(), maxNum);

    }

    private static TreeNode initTreeNode() {
        TreeNode leftTreeNode = new TreeNode(new TreeNode(0), -5, new TreeNode(3));
        TreeNode rightTreeNode = new TreeNode(new TreeNode(-4), 2, new TreeNode(-5));
        return new TreeNode(leftTreeNode, 1, rightTreeNode);
    }

}
