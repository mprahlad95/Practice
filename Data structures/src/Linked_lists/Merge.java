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
public class Merge {
    static Node head;
    static Node firstnew;
    
    public static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
        
        Node() {
          next = null;
          data = 0;
        }
    }
    
    public Node push(Node head, int d) {
        Node new_node = new Node(d);
        Node last = head;
        if (head == null) {
            head = new_node;
            last = head;
        } else {
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return last;
    }
   
    public void traverse(Node start) {
        Node last = start;
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.next;
        }
        System.out.println();
    }
    
    public void sortit(Node list1, Node list2) {
        Node finalList = new Node();
        firstnew = finalList;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                finalList.data = list1.data;
                finalList.next = list1;
                list1 = list1.next;
            } else if (list2.data < list1.data) {
                finalList.data = list2.data;
                finalList.next = list2;
                list2 = list2.next;
            }
            finalList = finalList.next;
            if (list1 == null) finalList.data = list2.data;
             else finalList.data = list1.data;
        }
    }

    
    public static void main(String[] args) {
        Merge LL1 = new Merge();
        Node head1, head2, first1, first2;
        head1 = head2 = null;
        head1 = LL1.push(head1, 3);
        first1 = head1;
        head1 = LL1.push(head1, 5);
        head1 = LL1.push(head1, 8);
        head1 = LL1.push(head1, 15);
        head1 = LL1.push(head1, 19);
        head2 = LL1.push(head2, 1);
        first2 = head2;
        head2 = LL1.push(head2, 9);
        head2 = LL1.push(head2, 10);
        head2 = LL1.push(head2, 16);
        head2 = LL1.push(head2, 17);
//        LL1.traverse(first1);
//        LL1.traverse(first2);
        LL1.sortit(first1, first2);
        LL1.traverse(firstnew);
    }
}
