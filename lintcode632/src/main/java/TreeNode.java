/**
 * @author ToQuery
 * @version 1.0
 * @date 17-4-10.
 */
public class TreeNode {

    private TreeNode parentTreeNode;

    private TreeNode leftChild;

    private TreeNode rightChild;

    private Integer currtObj;

    public TreeNode() {
    }

    public TreeNode(Integer currtObj) {
        this.currtObj = currtObj;
    }

    public TreeNode(TreeNode leftChild, Integer currtObj, TreeNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.currtObj = currtObj;
    }

    public TreeNode(TreeNode parentTreeNode, TreeNode leftChild, TreeNode rightChild, Integer currtObj) {
        this.parentTreeNode = parentTreeNode;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.currtObj = currtObj;
    }

    public TreeNode getParentTreeNode() {
        return parentTreeNode;
    }

    public void setParentTreeNode(TreeNode parentTreeNode) {
        this.parentTreeNode = parentTreeNode;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public Integer getCurrtObj() {
        return currtObj;
    }

    public void setCurrtObj(Integer currtObj) {
        this.currtObj = currtObj;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "parentTreeNode=" + parentTreeNode +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                ", currtObj=" + currtObj +
                '}';
    }
}
