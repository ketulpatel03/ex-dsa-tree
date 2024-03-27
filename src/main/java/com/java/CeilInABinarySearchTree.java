package com.java;

public class CeilInABinarySearchTree {

    private static int ceilBST(TreeNode root, int key) {
        int ceil = -1;
        while (root != null) {
            if (root.val == key) {
                return root.val;
            }
            if (key > root.val) {
                root = root.right;
            } else {
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
    }

    public static void main(String[] args) {

        // 10
        TreeNode treeNode = new TreeNode(10);

        // left
        // 5
        treeNode.left = new TreeNode(5);
        // 3
        treeNode.left.left = new TreeNode(3);
        // 2
        treeNode.left.left.left = new TreeNode(2);
        // 4
        treeNode.left.left.right = new TreeNode(4);
        // 6
        treeNode.left.right = new TreeNode(6);
        // 9
        treeNode.left.right.right = new TreeNode(9);

        // right
        // 13
        treeNode.right = new TreeNode(13);
        // 11
        treeNode.right.left = new TreeNode(11);
        // 14
        treeNode.right.right = new TreeNode(14);

        System.out.println(ceilBST(treeNode, 8));
    }

}
