
/*
Write a program to find the node at which the intersection of two singly linked lists begins.
 */
package com.learning.Leetcode;

class Node {
    int val ;
    Node next;
    Node(int val) {
        this.val = val;
       this.next = null;
    }

}
public class IntersecTionOfLinkedList {

    public static void main(String[] args) {
        Node headA = new Node(4);
        headA.next = new Node(1);
        headA.next.next = new Node(8);
        headA.next.next.next = new Node(4);
        headA.next.next.next.next = new Node(5);
        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(2);
        headB.next.next.next = new Node(8);
        headB.next.next.next.next = new Node(4);
        headB.next.next.next.next.next = new Node(5);

       findIntersection(headA , headB);
       // System.out.println(res.val);
    }

    public static void findIntersection(Node headA, Node headB) {
        if(headA == null || headB == null)
            return ;

        int count1 = count(headA);
        int count2 = count(headB);
       // System.out.println("count "+count1);
        if(count1 > count2) {
            int d = count1 - count2;
            for(int i =0;i<d;i++){
                headA = headA.next;
            }
            while(headA!=null || headB!=null) {
                if(headA.val == headB.val) {
                    System.out.println(headA.val);
                    return;
                }
                headA= headA.next;
                headB = headB.next;
            }
           return ;
        }
        else {
            int d = count2 - count1;
            for(int i =0;i<d;i++){
                headB = headB.next;
            }
            while(headB!=null || headA!=null) {
                if(headA.val == headB.val) {
                    System.out.println(headA.val);
                    return;
                }
                headA= headA.next;
                headB = headB.next;
            }
            return;
        }
    }


public static int count(Node node) {

        Node temp = node ;
        int count =0;
        if(temp == null)
            return 0;
        while(temp != null) {
            count = count+1;
            temp = temp.next;
        }
        return count;
    }
}

