/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q6;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double grams = in.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double fInit = in.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double fFinal = in.nextDouble();

        double kg = grams / 1000;
        double cInit = (fInit - 32) / 1.8;
        double cFinal = (fFinal - 32) / 1.8;

        double q = kg * (cFinal - cInit) * 4184;
        System.out.printf("The energy needed is %e%n", q);
    }
    
}
