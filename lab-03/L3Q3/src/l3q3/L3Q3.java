/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q3;

/**
 *
 * @author LENOVO
 */
import java.util.Locale;
import java.util.Scanner;
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the sales volume: ");
        double sales = keyboard.nextDouble();

        if (sales < 0) {
            System.out.println("Sales volume cannot be negative");
            return;
        }

        double rate;
        if (sales <= 100) {
            rate = 0.05;
        } else if (sales <= 500) {
            rate = 0.075;
        } else if (sales <= 1000) {
            rate = 0.10;
        } else {
            rate = 0.125;
        }
        double commission = sales * rate;
        System.out.printf(Locale.US, "Commission: %.2f%n", commission);    }
    
}
