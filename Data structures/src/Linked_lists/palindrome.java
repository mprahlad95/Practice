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
public class palindrome extends Template {
    
    public void reverse_newnode(Node head) {
        Node head1 = head;
        Node head_temp = head1;
        Node head2 = new Node();
        int flag = 0;
        Node temp = Template.reverse(head_temp);
        while (temp.next != null) {
            head2.data = temp.data;
            temp = temp.next;
            head2 = head2.next;
        }
        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                flag = 0;
            } else {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Palidrome linked list");
        } else {
            System.out.println("Not a palidrome linked list");
        }
    }
        

    

    
    public static void main(String[] args) {
        palindrome LL = new palindrome();
        LL.insert_end(1);
        LL.insert_end(2);
        LL.insert_end(4);
        LL.insert_end(4);
        LL.insert_end(2);
        LL.insert_end(1);
        LL.reverse_newnode(head);
    }
}
