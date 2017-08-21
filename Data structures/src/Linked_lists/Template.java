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
public class Template {
    
    static Node head, first, curr;
      
    static class Node {
        int data;
        Node next;
        Boolean visited;
        Node(int d) {
            data = d;
            next = null;
            visited = false;
        }
        Node() {
            next = null;
        }
    }
    
    
    public Node insert_end(int d) {
            Node new_node = new Node(d);
            if (head == null) {
                head = new_node;
                first = head;
            }
            else {
                Node last = head;
                while (last.next != null)
                    last = last.next;
                    last.next = new_node;
            }
            return head;
    }
    
    public void insert_front(int d) {
       Node new_node = new Node(d);
       new_node.next = head;
       head = new_node;
    }
    
    public static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    
  public static void traverse(Node start) {
        Node last = start;
        while (last != null) {
            System.out.print(" -> " + last.data);
            last = last.next;
        }
        System.out.println();
    }
    
        public Node push(Node head, int d) {
        Node new_node = new Node(d);
        Node last = head;
        if (head == null) {
            head = new_node;
            last = head;
        } else {
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return head;
    }
        
        public Node delete(int value) {
        Node last = head;
        Node prev = null;
        while (last.next != null) {
            prev = last;
            last = last.next;
            if (last.data == value) {
            prev.next = last.next;
            return head;
            }
        }
        return head;
    }
}
