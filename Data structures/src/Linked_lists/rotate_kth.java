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
public class rotate_kth extends Template {
    
    public Node rotate(Node head, int k) {
        Node current = head;
        Node temp = null;
        int count = 0;
        while (++count < 4) {
            current = current.next;
        }
        temp = current;
        while (current.next != null) {
            current = current.next;
        }
        current.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
    
    public static void main(String[] args) {
        rotate_kth LL = new rotate_kth();
        Node key = new Node(4);
        LL.insert_end(10);
        LL.insert_end(20);
        LL.insert_end(30);
        LL.insert_end(40);
        LL.insert_end(50);
        LL.insert_end(60);
        LL.traverse(head);
        Node rotated = LL.rotate(head, key.data);
        LL.traverse(rotated);
    }
}
