package com.learning.resursion;

public class InorderRecursion {
    public static void printInorder(Node root) {
        if(root == null)
            return;

        printInorder(root.left);
        System.out.print(root.key+" ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);

        printInorder(node);
    }
}
