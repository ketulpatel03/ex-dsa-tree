package com.java;

public class InsertNodeInABinarySearchTree {

    private static TreeNode insertNodeBST(TreeNode treeNode, int val) {
        if (treeNode == null) {
            return new TreeNode(val);
        }
        TreeNode cur = treeNode;
        while (true) {
            if (val >= cur.val) {
                if(cur.right == null) {
                    cur.right = new TreeNode(val);
                    break;
                } else {
                    cur = cur.right;
                }
            } else {
                if(cur.left == null){
                    cur.left = new TreeNode(val);
                    break;
                } else {
                    cur = cur.left;
                }
            }
        }
        return treeNode;
    }

    public static void main(String[] args) {
        // 6
        TreeNode treeNode = new TreeNode(6);

        // left
        // 3
        treeNode.left = new TreeNode(3);
        // 2
        treeNode.left.left = new TreeNode(2);
        // 4
        treeNode.left.right = new TreeNode(4);

        // right
        // 8
        treeNode.right = new TreeNode(8);
        // 7
        treeNode.right.left = new TreeNode(7);

        System.out.println(insertNodeBST(treeNode, 5));
    }

}
