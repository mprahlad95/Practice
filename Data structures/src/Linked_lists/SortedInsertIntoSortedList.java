/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_lists;

/**
 *
 * @author Prahlad Misra <mprahlad95@gmail.com>
 */
public class SortedInsertIntoSortedList {
    
    static Node head, first;
    
    static class Node {

        Node next;
        int data;

        Node(int d) {
            data = d;
            next = null;
        }
}
    public void insert_end(int d) {
            Node new_node = new Node(d);
            if (head == null) {
                head = new_node;
                first = head;
            }
            else {
                new_node.next = null;
                Node last = head;
                while (last.next != null)
                    last = last.next;
                    last.next = new_node;
            }
    }
    
    public void insertkey(Node new_node) {
        Node last = first;
        while (last.next != null && last.next.data < new_node.data) {
            last = last.next;
        }
        new_node.next = last.next;
        last.next = new_node;
    }
    
     public void traverse(Node start) {
        Node last = start;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
        System.out.println();
    }
     
    public static void main (String[] args) {
        SortedInsertIntoSortedList ll = new SortedInsertIntoSortedList();
        Node new_node = new Node(9);
        ll.insert_end(2);
        ll.insert_end(5);
        ll.insert_end(7);
        ll.insert_end(10);
        ll.insert_end(15);
        ll.traverse(first);
        ll.insertkey(new_node);
        ll.traverse(first);
    }
}
