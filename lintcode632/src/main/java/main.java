/**
 * @author ToQuery
 * @version 1.0
 * @date 17-4-10.
 */
public class main {

    public static TreeNode maxTree = new TreeNode(0);

    public static void main(String[] s) {
        TreeNode treeNode = initTreeNode();
        getMaxNum(treeNode);
        System.out.println(maxTree);
    }

    private static void getMaxNum(TreeNode treeNode) {
        if (treeNode == null){
            return;
        }

        if (maxTree.getCurrtObj() < treeNode.getCurrtObj()) {
            maxTree = treeNode;
        }
        getMaxNum(treeNode.getLeftChild());
        getMaxNum(treeNode.getRightChild());

    }

    private static TreeNode initTreeNode() {
        TreeNode leftTreeNode = new TreeNode(new TreeNode(0), -5, new TreeNode(3));
        TreeNode rightTreeNode = new TreeNode(new TreeNode(-4), 2, new TreeNode(-5));
        return new TreeNode(leftTreeNode, 1, rightTreeNode);
    }

}
