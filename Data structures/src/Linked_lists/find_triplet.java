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
public class find_triplet extends Template {
  
    public void triplet(Node head1, Node head2, Node head3, int key) {
        Node current1 = head1, current2 = head2, current3 = head3;
        while (current1 != null) {
            current2 = head2;
            while (current2 != null) {
                current3 = head3;
                while (current3 != null) {
                    if (current1.data + current2.data + current3.data == key) {
                        System.out.println(current1.data + " " + current2.data + " " + current3.data);
                    }
                    current3 = current3.next;
                }
                current2 = current2.next;
            }
            current1 = current1.next;
        }
    }
    
    public static void main(String[] args) {
        find_triplet LL = new find_triplet();
        Node head1 = null, head2 = null, head3 = null;
        Node key = new Node (101);
        head1 = LL.push(head1, 12);
        head1 = LL.push(head1, 6);
        head1 = LL.push(head1, 29);
        head2 = LL.push(head2, 23);
        head2 = LL.push(head2, 5);
        head2 = LL.push(head2, 8);
        head3 = LL.push(head3, 90);
        head3 = LL.push(head3, 20);
        head3 = LL.push(head3, 59);
        LL.traverse(head1);
        LL.traverse(head2);
        LL.traverse(head3);
        LL.triplet(head1, head2, head3, key.data);
    }
}
