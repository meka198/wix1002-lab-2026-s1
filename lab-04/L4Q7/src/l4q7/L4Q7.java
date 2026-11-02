/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q7;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class L4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = keyboard.nextDouble();
        System.out.print("Enter interest in %: ");
        double yearlyRate = keyboard.nextDouble();
        System.out.print("Enter total number of month(s): ");
        int months = keyboard.nextInt();

        if (principal <= 0 || yearlyRate <= 0 || months <= 0) {
            System.out.println("Principal, interest and months must be positive.");
            return;
        }

        double r = yearlyRate / (12 * 100);                               
        double payment = principal * r / (1 - Math.pow(1 + r, -months));  
        double totalInterest = 0;

        System.out.printf("%-6s%18s%14s%12s%18s%18s%n", "Month", "Monthly Payment",
                "Principal", "Interest", "Unpaid Balance", "Total Interest");
        for (int n = 1; n <= months; n++) {
            double principalDue = payment * Math.pow(1 + r, -(1 + months - n));  
            double interestDue = payment - principalDue;                          
            double balance = interestDue / r - principalDue;                      
            totalInterest += interestDue;
            System.out.printf("%-6d%18.2f%14.2f%12.2f%18.2f%18.2f%n", n, payment,
                    principalDue, interestDue, Math.abs(balance), totalInterest);
        }    
    }
    
}
