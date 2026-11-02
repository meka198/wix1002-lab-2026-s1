/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q4;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = keyboard.nextInt();
        System.out.print("Enter the first day of the year (0 = Sunday ... 6 = Saturday): ");
        int firstDay = keyboard.nextInt();

        if (firstDay < 0 || firstDay > 6) {
            System.out.println("The first day must be from 0 to 6.");
            return;
        }

        boolean leap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        int february = leap ? 29 : 28;

        
        int startMay = (firstDay + 31 + february + 31 + 30) % 7;
        
        int startAugust = (startMay + 31 + 30 + 31) % 7;

        for (int month = 1; month <= 2; month++) {
            String name = (month == 1) ? "May" : "August";
            int start = (month == 1) ? startMay : startAugust;

            System.out.println();
            System.out.println("          " + name + " " + year);
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
            for (int blank = 0; blank < start; blank++) {
                System.out.print("    ");
            }
            for (int day = 1; day <= 31; day++) {   
                System.out.printf("%4d", day);
                if ((start + day) % 7 == 0) {
                    System.out.println();
                }
            }
            if ((start + 31) % 7 != 0) {
                System.out.println();
            }
        }    }
    
}
