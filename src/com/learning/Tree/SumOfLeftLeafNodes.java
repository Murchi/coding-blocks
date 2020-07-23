package com.learning.Tree;

public class SumOfLeftLeafNodes {
    public static void main(String[] args) {
        TreNode root = new TreNode(1);
        root.left = new TreNode(2);
        root.right = new TreNode(3);
        root.right.left = new TreNode(5);

        int res = findSum(root);
        System.out.println(res);
    }

    public static int findSum(TreNode root) {
        if(root == null)
            return  0;
        int res = helper(true, root.left)+helper(false, root.right);
        return res;
    }

    public static int helper(boolean isLeft , TreNode root){
        if(root == null)
            return 0;
        if(isLeft == true && root.left == null && root.right == null)
            return root.data;
        return helper(true, root.left)+helper(false,root.right);
    }
}
