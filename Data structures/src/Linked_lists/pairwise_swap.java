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
public class pairwise_swap extends Template {
    
    public Node swap_pair(Node head) {
        Node temp, curr;
        curr = head;
        temp = new Node();
        while(curr != null && curr.next != null) {
            temp.data = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp.data;
            curr = curr.next.next;
        }
        return head;
    }
    
    public static void main(String[] args) {
        pairwise_swap LL = new pairwise_swap();
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(3);
        LL.insert_end(4);
        LL.insert_end(5);
        LL.insert_end(6);
        Node swapped = LL.swap_pair(head);
        LL.traverse(swapped);
    }
    
}
