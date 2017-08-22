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
public class union_intersection extends Template {
    
    public Node union(Node head1, Node head2) {
        Node current1 = head1, current2 = head2;
        Node union = null;
        HashSet<Integer> hs = new HashSet();
        while (current1 != null || current2 != null) {
            if (current1 != null) {
                hs.add(current1.data);
            }
            if (current2 != null) {
                hs.add(current2.data);
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        for (int x : hs) {
            union = push(union, x);
        }
        return union;
    }
    
    public Node intersection (Node head1, Node head2) {
        Node current1 = head1, current2 = head2;
        Node intersection = null;
        while (current1 != null) {
            current2 = head2;
            while (current2 != null) {
                if (current1.data == current2.data) {
                    intersection = push(intersection, current1.data);
                }
                current2 = current2.next;
            }
            current1 = current1.next;
        }
        return intersection;
    }
    
    public static void main(String[] args) {
        union_intersection LL = new union_intersection();
        Node head1 = null, head2 = null;
        head1 = LL.push(head1, 10);
        head1 = LL.push(head1, 15);
        head1 = LL.push(head1, 4);
        head1 = LL.push(head1, 20);
        head2 = LL.push(head2, 8);
        head2 = LL.push(head2, 4);
        head2 = LL.push(head2, 2);
        head2 = LL.push(head2, 10);
        LL.traverse(head1);
        LL.traverse(head2);
        Node union = LL.union(head1, head2);
        Node intersection = LL.intersection(head1, head2);
        LL.traverse(union);
        LL.traverse(intersection);
    }

}
