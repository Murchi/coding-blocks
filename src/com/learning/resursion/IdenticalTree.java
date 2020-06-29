/*
Check if two binary trees are identical
 */
package com.learning.resursion;


class Node {
    int key;
    Node left = null;
    Node right = null;
    Node(int key) {
        this.key = key;
    }
}

public class IdenticalTree {
    public static boolean checkIfIdentical(Node a, Node b) {
        if(a == null && b == null)
            return true;

        return (a!=null && b!=null) && (a.key == b.key) && checkIfIdentical(a.left,b.left)
                && checkIfIdentical(a.right,b.right);
    }

    public static void main(String[] args) {
        Node a = new Node(15);
        a.left = new Node(16);
        a.right = new Node(17);
        a.left.left = new Node(18);
        a.left.right = new Node(19);

        Node b = new Node(15);
        b.left = new Node(16);
        b.right = new Node(17);
        b.left.left = new Node(18);
        b.left.right = new Node(20);

        System.out.println(checkIfIdentical(a,b));
    }
}
