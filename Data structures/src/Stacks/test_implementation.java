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
public class test_implementation extends Stack_int {
    
    public static void main(String[] args) {
        test_implementation s = new test_implementation();
        s.push(10);
        s.push(1);
        s.push(5);
        s.push(3);
        s.push(7);
        s.push(2);
        s.push(8);
        System.out.println("Peeking at " + s.peek());
        s.printstack();
        while (top >= 0) {
            System.out.println("Popping " + s.a[top--]);
        }
    }
    
}
