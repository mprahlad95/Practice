package Linked_lists;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prahlad Misra <mprahlad95@gmail.com>
 */
public class reverse_k_alternate_nodes extends Template {

    public Node reversed_nodes(int k, Node head) {
        Node current = head;
        Node prev = null;
        Node temp = null;
        Node prev_obj = new Node();
        int count = 0;
        while (current != null && (count < k)) {
            temp = current.next;
            current.next = prev;
            prev = current;
            if (count == 0) {
                prev_obj = prev;
            }
            current = temp;
            count++;
        }
        prev_obj.next = current;
        return prev;
    }
    
    public static void main(String[] args) {
        reverse_k_alternate_nodes LL = new reverse_k_alternate_nodes();
        Node k = new Node(3);
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.insert_end(4);
        LL.insert_end(5);
        LL.insert_end(6);
        LL.insert_end(7);
        LL.insert_end(8);
        LL.insert_end(9);
        LL.traverse(head);
        Node reversed = LL.reversed_nodes(k.data, head);
        LL.traverse(reversed);
    }
}
