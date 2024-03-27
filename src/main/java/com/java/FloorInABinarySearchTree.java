package com.java;

public class FloorInABinarySearchTree {

    private static int floorBST(TreeNode root, int key) {
        int floor = -1;
        while (root != null) {
            if (root.val == key) {
                return root.val;
            }
            if (key > root.val) {
                floor = root.val;
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return floor;
    }

    public static void main(String[] args) {

        // 10
        TreeNode treeNode = new TreeNode(10);

        // left
        // 5
        treeNode.left = new TreeNode(5);
        // 2
        treeNode.left.left = new TreeNode(2);
        // 8
        treeNode.left.right = new TreeNode(8);
        // 6
        treeNode.left.right.left = new TreeNode(6);

        // right
        // 15
        treeNode.right = new TreeNode(15);
        // 13
        treeNode.right.left = new TreeNode(13);
        // 17
        treeNode.right.right = new TreeNode(17);

        System.out.println(floorBST(treeNode, 9));
    }

}
