/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two interger number: ");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();
        System.out.println("Enter the operand: ");
        char operator = keyboard.next().charAt(0);
        
        switch (operator) {
            case '+' :
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                        break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Invalid operator: " + operator);
            
        }
        
        
                
    }
    
}
