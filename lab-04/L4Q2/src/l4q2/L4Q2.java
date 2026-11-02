/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = keyboard.nextInt();

        long term = 0;    
        long total = 0;   
       
        for (int i = 1; i <= n; i++) {
            term += i;
            total += term;
        }
        System.out.println("Sum = " + total);
        
    }
    
}
