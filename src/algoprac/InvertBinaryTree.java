package algoprac;

import algoprac.ds.TreeNode;

public class InvertBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    public TreeNode invertTree(TreeNode root) {
        if(root.left != null)
            root.left = invertTree(root.left);
        if(root.right != null)
            root.right = invertTree(root.right);
        root = swapChildren(root);
        return root;
    }

    public TreeNode swapChildren(TreeNode node){
        //has two children
        TreeNode temp = node.left;
        node.left = node.right;
        node.right =  temp;
        return node;
    }

    public void bfs(TreeNode root){
        if(root != null){

            bfs(root.left);
            bfs(root.right);
            System.out.println(root.val);
        }
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        InvertBinaryTree i = new InvertBinaryTree();
        i.bfs(root);
        root = i.invertTree(root);
        System.out.println("``````````````````````````````````````````");
        i.bfs(root);
    }
}












