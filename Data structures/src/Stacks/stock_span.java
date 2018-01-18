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
public class stock_span extends Stack_int {
    
    public void span() {
        int arr[] = new int[7];
        int count = 0, j = 0;
        while (top >= 0) {
            count = 0;
            j = top;
            while (j >= 0) {
                if (a[top] >= a[j]) {
                    count++;
                    j--;
                }
                else {
                    break;
                }
            }
            arr[top] = count;
            top--;
        }
        count = 6;
        while (count >= 0) {
            System.out.println(a[count]  + " -> " + arr[count] + " ");
            count--;
        }
         System.out.println();
    }
    
    public static void main(String[] args) {
        stock_span s = new stock_span();
        s.push(100);
        s.push(80);
        s.push(60);
        s.push(70);
        s.push(60);
        s.push(75);
        s.push(85);
        s.span();
    }
}
