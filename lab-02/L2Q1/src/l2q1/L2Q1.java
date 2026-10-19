/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class L2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
 *  Write a program that convert the temperature in degree Fahrenheit to degree Celsius. The program will display the degree Celsius in two decimal places.

Celsius = (Fahrenheit - 32) / 1.8

 */
       Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = in.nextDouble();
        double c = (f - 32) / 1.8;
        System.out.printf("%.2f degree Celsius%n", c);
    }
}
    
    

