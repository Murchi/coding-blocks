package com.learning.Tree;



public class DiameterOfaTree {
    public static void main(String[] args) {
        TreNode root = new TreNode(1);
        root.left = new TreNode(2);
        root.right = new TreNode(4);
        root.left.left = new TreNode(5);
        root.left.right = new TreNode(6);
        root.left.left.left = new TreNode(7);
        root.left.right.right = new TreNode(8);
        int res = finddiameter(root);
        System.out.println(res);
    }
    
    public static int finddiameter(TreNode root) {
        if(root == null)
            return 0;
        int p1 = height(root.right)+height(root.left);
        int p2 = finddiameter(root.left);
        int p3 = finddiameter(root.right);
        return  Math.max(p1,Math.max(p2,p3));
    }
    
    public static int height(TreNode root) {
        if(root == null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
}
