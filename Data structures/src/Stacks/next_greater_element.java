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
public class next_greater_element extends Stack_int {
    
    public void next_g() {
        int i = top+1, j = 0, n = 0, flag;
        while(i-- > 0) {
            n = a[i];
            j = i;
            flag = 0;
            while (j++ <= (i+1))
            {
                if (a[j] > n) {
                    System.out.println(n + " --> " + a[j]);
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " --> " + "-1");
            }
        }
    }
    
    public static void main(String[] args) {
        next_greater_element s = new next_greater_element();
        s.push(13);
        s.push(7);
        s.push(6);
        s.push(12);
        s.next_g();
    }
}
