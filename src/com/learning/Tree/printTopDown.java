package com.learning.Tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class printTopDown {

    public static void printTopDown(Node root) {
        if(root == null)
            return;
        System.out.print(root.key+" ");
        Queue<Node>q1 = new ArrayDeque<>();
        q1.add(root.left);

        Queue<Node>q2 = new ArrayDeque<>();
        q2.add(root.right);

        while (!q1.isEmpty()) {
            int n = q1.size();

            while(n-- > 0){
                Node x = q1.poll();
                System.out.print(x.key+" ");
                if(x.left!=null)
                    q1.add(x.left);
                if(x.right!=null)
                    q1.add(x.right);


                Node y = q2.poll();
                System.out.print(y.key+" ");
                if(y.right!=null)
                    q2.add(y.right);
                if(y.left!=null)
                    q2.add(y.left);
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

        printTopDown(node);
    }
}
