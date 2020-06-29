package com.learning.Tree;

import java.util.Stack;

class Node {
    int key;
    Node left = null;
    Node right = null;
    Node(int key) {
        this.key = key;
    }
}
public class SprialPrint {
    public static void spiralPrint(Node root) {
        if(root == null)
            return;

        Stack<Node>s1 = new Stack<>();
        Stack<Node>s2 = new Stack<>();

        s1.push(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                Node val = s1.peek();
                s1.pop();
                System.out.println(val.key+" ");
                if(val.right!=null)
                s2.push(val.right);
                if(val.left!=null)
                s2.push(val.left);
            }

            while (!s2.isEmpty()) {
                Node val = s2.peek();
                s2.pop();
                System.out.println(val.key+" ");
                if(val.left!=null)
                s1.push(val.left);
                if(val.right!=null)
                s1.push(val.right);

            }
        }
    }

    public static void main(String[] args) {
      Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new  Node(6);
        node.right.right = new Node(7);

        spiralPrint(node);
    }
}
