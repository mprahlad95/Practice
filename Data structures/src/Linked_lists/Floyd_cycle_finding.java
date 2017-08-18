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
public class Floyd_cycle_finding {

    static Node head;

    static class Node {

        int data;
        Node next;
        Node last;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } 
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void detect_loop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Loop found");
                return;
            }
       }
       System.out.println("No loop found");
    }

    public static void main(String[] args) {
        Floyd_cycle_finding detect = new Floyd_cycle_finding();
        detect.push(1);
        detect.push(5);
        detect.push(11);
        detect.push(9);
        detect.head.next.next.next.next = head;
        detect.detect_loop();
    }

}
