package com.learning.Tree;

public class SumOfLeafNodes {
    public static void main(String[] args) {
        TreNode root = new TreNode(1);
        root.left = new TreNode(2);
        root.right = new TreNode(3);
        int res = findSum(root);
        System.out.println(res);
    }

    public static int findSum(TreNode root) {
        if(root == null)
            return 0;
        int res =  helper(root.left)+helper(root.right);
        return res;
    }
    public static int helper(TreNode root) {
        if(root  ==  null)
            return 0;
        if(root.left == null && root.right == null)
            return root.data;
        return  helper(root.left)+helper(root.right);
    }

}
