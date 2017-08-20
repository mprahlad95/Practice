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
public class find_intersection extends Template{
    boolean visited;
    public void get_intersection(Node head1, Node head2) {
        Node first11 = head1;
        Node first22 = head2;
        while (first11.next != null) {
            first11.visited = true;
            first11 = first11.next;
        }
        while (first22.next != null) {
            if (first22.visited != true) {
                first22.visited = true;
                first22 = first22.next;
            } else {
                System.out.println(first22.next.data + " is the intersection point");
                return;
            }
        }
    }
    
    public static void main (String[] args) {
        find_intersection LL = new find_intersection();
        Node head1, head2, first1, first2;
        head1 = head2 = null;
        head1 = LL.push(head1, 3);
        first1 = head1;
        head1 = LL.push(head1, 6);
        head1 = LL.push(head1, 9);
        head2 = LL.push(head2, 10);
        first2 = head2;
        head1.next = head2;
        head2 = LL.push(head2, 2);
        head2 = LL.push(head2, 12);
        head2 = LL.push(head2, 30);
        LL.get_intersection(first1, first2);
    }
}
