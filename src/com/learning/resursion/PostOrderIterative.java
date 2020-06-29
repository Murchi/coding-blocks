package com.learning.resursion;

import java.util.Stack;

public class PostOrderIterative {

    public static void printPostOrder(Node root) {
        Stack<Node>stack = new Stack<>();

        Node curr = root;
       stack.push(root);
        while(curr!=null) {
           // if(curr!=null) {
               // stack.push(curr);
                if(curr.right!=null)
                    stack.push(curr.right);
                if(curr.left!=null)
                    stack.push(curr.left);
                curr = curr.left;
           // }

        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop().key+" ");
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        printPostOrder(node);
    }
}
