/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linked_lists;

import java.util.HashSet;

/**
 *
 * @author Prahlad Misra <mprahlad95@gmail.com>
 */
public class intersectionfn_sortedlists extends Template {
    
    public Node intersection(Node head1, Node head2) {
        Node start1 = head1;
        Node start2 = head2;
        Node new_node = new Node();
        while (start1 != null) {
            start2 = head2;
            while(start2 != null) {
                if (start1.data == start2.data) {
                        new_node = insert_end(start1.data);
                }
                start2 = start2.next;
            }
            start1 = start1.next;
        }
        return new_node;
    }
    
    public static void main(String[] args) {
        intersectionfn_sortedlists LL = new intersectionfn_sortedlists();
        Node head1, head2;
        head1 = head2 = null;
        head1 = LL.push(head1, 1);
        head1 = LL.push(head1, 2);
        head1 = LL.push(head1, 3);
        head1 = LL.push(head1, 4);
        head1 = LL.push(head1, 6);
        head2 = LL.push(head2, 1);
        head2 = LL.push(head2, 2);
        head2 = LL.push(head2, 3);
        head2 = LL.push(head2, 4);
        head2 = LL.push(head2, 8);
        Node common = LL.intersection(head1, head2);
        LL.traverse(common);
    }
}
