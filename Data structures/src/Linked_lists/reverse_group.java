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
public class reverse_group extends Template {
    
    public Node reverse_size(int key, Node head) {
        Node current = head;
        int count = 0;
        Node temp;
        Node prev = new Node();
        Node prev_obj = null;
        while (current != null && count < key) {
            temp = current.next;
            current.next = prev;
            prev = current;
            if (count == 0) 
                prev_obj = prev;
            current = temp;
            count++;
        }
        prev_obj.next = current;
        return prev;
    }
    public static void main(String[] args) {
        reverse_group LL = new reverse_group();
        Node key = new Node(3);
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.insert_end(4);
        LL.insert_end(5);
        LL.insert_end(6);
        LL.insert_end(7);
        LL.insert_end(8);
        LL.insert_end(9);
        LL.insert_end(10);
        LL.traverse(head);
        Node reversed = LL.reverse_size(key.data, head);
        LL.traverse(reversed);
    }
    
}
