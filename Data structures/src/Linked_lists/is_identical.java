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
public class is_identical extends Template {
    
    public boolean identical_check(Node head1, Node head2) {
        Node first = head1;
        Node second = head2;
        while(first != null && second != null) {
            if (first.data != second.data) {
                return false;
            }
            if (first.data == second.data) {
                first = first.next;
                second = second.next;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        is_identical LL = new is_identical();
        Node head1, head2;
        head1 = new Node();
        head2 = new Node();
        head1 = LL.push(head1, 1);
        head1 = LL.push(head1, 2);
        head1 = LL.push(head1, 3);
        head1 = LL.push(head1, 4);
        head2 = LL.push(head2, 1);
        head2 = LL.push(head2, 2);
        head2 = LL.push(head2, 3);
        head2 = LL.push(head2, 4);
        head2 = LL.push(head2, 4);
        head2 = LL.push(head2, 4);
        boolean result = LL.identical_check(head1, head2);
        System.out.println("The lists are identical. State true or false.\n" + result);
    }
}
