package com.learning.Tree;


class TreNode {
    int data;
    TreNode left,right;

    TreNode(int value) {
        data = value;
        left = right = null;
    }
}
public class LowestCommonAncestor {

    TreNode root;
    TreNode findLca(int n1,int n2){
        return  findLca(root,n1,n2);
    }

    TreNode findLca(TreNode node,int n1,int n2) {
        if(node == null)
            return null;

        if(node.data == n1 || node.data == n2)
            return node;

        TreNode node_left = findLca(node.left,n1,n2);
        TreNode node_right = findLca(node.right,n1,n2);
        if(node_left != null && node_right!=null)
            return node;
        return(node_left!=null )? node_left:node_right;
    }

    public static void main(String[] args) {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new TreNode(1);
        tree.root.left = new TreNode(2);
        tree.root.right = new TreNode(3);
        tree.root.left.left = new TreNode(4);
        tree.root.left.right = new TreNode(5);
        tree.root.right.left = new TreNode(6);
        tree.root.right.right = new TreNode(7);
        TreNode res = tree.findLca(4,5);
        System.out.println("LCA is : "+res.data);
    }

}
