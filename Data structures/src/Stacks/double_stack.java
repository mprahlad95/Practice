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
public class double_stack {

    static int max = 1000;
    int a[] = new int[max];
    int top1, top2;
    
    double_stack() {
        top1 = -1;
        top2 = max;
    }
   
    public void push1(int data) {
        if (top2 - top1 ==  0) {
            System.out.println("Stack overflow");
            return;
        }
        a[++top1] = data;
    }
        
    public void push2(int data) {
        if (top2 - top1 ==  0) {
            System.out.println("Stack overflow");
            return;
        }
        a[--top2] = data;
    }
    
    public int pop1() {
        if (top1 < 0) {
            System.out.println("Stack underflow");
            return 0;
        }
        return a[top1--]; 
    }
    
    public int pop2() {
        if (top2 >= max) {
            System.out.println("Stack underflow");
            return 0;
        }
        return a[top2++]; 
    }
    
    public static void main(String[] args) {
        
        double_stack s = new double_stack();
        s.push1(1);
        s.push1(2);
        s.push1(4);
        s.push1(5);
        s.push1(7);
        s.push2(6);
        s.push2(1);
        s.push2(7);
        s.push2(3);
        s.push2(2);
        System.out.println("Popped element from stack 1 - " + s.pop1());
        System.out.println("Popped element from stack 2 - " + s.pop2());
    }
    
}
