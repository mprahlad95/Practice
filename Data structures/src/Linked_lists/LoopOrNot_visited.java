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
public class LoopOrNot_visited {
    
    static Node head;
        
    static class Node {
        int data;
        Node next;
        Boolean visited;
        Node (int d) {
            data = d;
            next = null;
            visited = false;
        }
    }
    
    public void push (int new_data) {
        Node new_node = new Node (new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public void detect_loop (Node head) {
        Node current = head;
        while (current.next != null) {
            current.visited = true;
            current = current.next;
            if (current.visited == true) {
                System.out.println("Loop found");
                return;
            }
        }
    }
    public static void main (String[] args) {
        LoopOrNot_visited detect = new LoopOrNot_visited ();
        detect.push(1);
        detect.push(5);
        detect.push(11);
        detect.push(9);
        detect.head.next.next.next.next = detect.head;
        detect.detect_loop(head);
        
        
        
    }
    
}
