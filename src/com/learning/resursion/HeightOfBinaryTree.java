package com.learning.resursion;

/*class Node {
    int key ;
    Node left = null;
    Node right = null;
    Node(int key) {
        this.key = key;
    }

}*/
public class HeightOfBinaryTree {

    public static int getHeight(Node a) {
        if(a == null)
            return 0;
        return 1+Math.max(getHeight(a.left),getHeight(a.right));
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(16);
        root.right = new Node(17);

        System.out.println(getHeight(root));
    }

}
