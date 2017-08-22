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
public class add_numbers extends Template {
    
    public Node add(Node x, Node y) {
        Node current1 = x;
        Node current2 = y;
        Node sum_node = new Node();
        int sum = 0, carry = 0;
        while (current1.next != null || current2.next != null) {
            sum = current1.data + current2.data + carry;
            if (carry == 1) {
                if (sum > 9) {
                sum_node = new Node (sum - 10);
                carry = 1;
            }
            else {
                sum_node = new Node(sum);
                carry = 0;
            }
        }
            push_front(sum_node, sum);
            sum_node = sum_node.next;
        }
        return sum_node;
    }
    
    public static void main(String[] args) {
        add_numbers LL = new add_numbers();
        Node head1 = null;
        Node head2 = null;
        //64957 + 48 = 65005
        head1 = LL.push(head1, 1);
        head1 = LL.push(head1, 4);
        head1 = LL.push(head1, 9);
        head1 = LL.push(head1, 5);
        head1 = LL.push(head1, 7);
        head2 = LL.push(head2, 4);
        head2 = LL.push(head2, 8);
        LL.traverse(head1);
        LL.traverse(head2);
        Node added = LL.add(head1, head2);
        LL.traverse(added);
    }
    
}
