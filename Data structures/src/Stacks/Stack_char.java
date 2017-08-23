/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author Prahlad Misra <mprahlad95@gmail.com>
 */
public class Stack_char {

    static int max = 1000;
    char a[] = new char[max];
    static int top;

    Stack_char() {
        top = -1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(char data) {
        if (top >= max-1) {
            System.out.println("Stack overflow");
            return;
        }
        a[++top] = data;
    }

    public char pop() {
        if (top < 0) {
            System.out.println("Empty stack");
            return 0;
        }
        return a[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Empty stack");
            return 0;
        }
        return a[top];
    }
    
    public void printstack() {
        int i = top;
        while (i > -1) {
            System.out.println(a[i--] + " ");
        }
        System.out.println();
    }
}
