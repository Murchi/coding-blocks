package com.learning.resursion;

import java.util.Stack;

public class InorderIterative {
    public static void printInorder(Node root) {
        Stack<Node>stack = new Stack<Node>();

        Node curr = root;

        while(!stack.empty() || curr!=null) {
            if(curr!=null) {
                //System.out.println(curr.key);
                stack.push(curr);
                curr = curr.left;
            }
            else {
                curr = stack.pop();
                System.out.print(curr.key+" ");
                curr = curr.right;
            }
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);

        printInorder(node);

    }
}
