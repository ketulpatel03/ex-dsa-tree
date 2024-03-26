package com.java;

public class SearchInABinarySearchTree {

    private static TreeNode searchBST(TreeNode root, int s) {
        while (root != null && root.val != s) {
            if (s < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }

    public static void main(String[] args) {

        // 8
        TreeNode treeNode = new TreeNode(8);

        // left
        // 5
        treeNode.left = new TreeNode(5);
        // 4
        treeNode.left.left = new TreeNode(4);
        // 7
        treeNode.left.right = new TreeNode(7);
        // 6
        treeNode.left.right.left = new TreeNode(6);

        // right
        // 12
        treeNode.right = new TreeNode(12);
        // 10
        treeNode.right.left = new TreeNode(10);
        // 14
        treeNode.right.right = new TreeNode(14);
        // 13
        treeNode.right.right.left = new TreeNode(13);

        System.out.println(searchBST(treeNode, 12));

    }

}
