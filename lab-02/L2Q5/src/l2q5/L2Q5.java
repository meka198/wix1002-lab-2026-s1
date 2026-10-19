/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q5;

/**
 *
 * @author LENOVO
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int n = (int) (Math.random() * 10001);   // 0..10000 inclusive
        int temp = n, sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Number: " + n);
        System.out.println("Sum of digits: " + sum);    
    }
    
}
