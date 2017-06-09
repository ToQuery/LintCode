/**
 * Created by toquery on 2017/4/15.
 */
public class Solution {
    static class TreeNode {
     int val;
      TreeNode left;
    TreeNode right;
     TreeNode(int x) { val = x; }
 }
    public int sumNum=0;
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0 ;
        }
        if(root.left != null){
            String temp1 = String.valueOf(root.val) + String.valueOf(root.left.val);
            System.out.println("left:"+temp1);
            sumNum = Integer.valueOf(temp1)+ sumNumbers(root.left);
            System.out.println("left:"+sumNum);

        }
        if(root.right != null){
            String temp2 = String.valueOf(root.val) +   String.valueOf(root.right.val);
            System.out.println("right:"+temp2);
            sumNum =   Integer.valueOf(temp2)+ sumNumbers(root.right);
            System.out.println("left:"+sumNum);
        }
        return sumNum;
    }

    public static void main(String[] a){
        Solution s = new Solution();
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        System.out.println(s.sumNumbers(t));;
    }

}