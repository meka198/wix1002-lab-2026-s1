/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter New Interger: ");
        int number = keyboard.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("The factors are: 1");
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(", " + i);
            }
        }
        System.out.println();
    }
    
}
