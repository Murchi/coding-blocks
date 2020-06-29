package com.learning.resursion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PreOrderIterative {
    public static void printPreOrder(Node root) {
        Stack<Node> stack = new Stack<>();


        if(root == null)
            return;
        stack.push(root);
        while(!stack.isEmpty() ) {
            Node curr = stack.pop();
            System.out.print(curr.key+" ");
            if(curr.right!=null)
                stack.push(curr.right);
            if(curr.left!=null)
                stack.push(curr.left);

        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        printPreOrder(node);
    }
}
