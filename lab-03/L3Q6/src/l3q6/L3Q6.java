/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q6;

/**
 *
 * @author LENOVO
 */
import java.util.Locale;
import java.util.Scanner;
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter the radius of the circle: ");
        double radius = keyboard.nextDouble();
        System.out.print("Enter a point (x y): ");
        double x = keyboard.nextDouble();
        double y = keyboard.nextDouble();

        double distance = Math.sqrt(x * x + y * y);
        if (distance <= radius) {
            System.out.printf(Locale.US, "Point (%.2f, %.2f) is inside the circle%n", x, y);
        } else {
            System.out.printf(Locale.US, "Point (%.2f, %.2f) is outside the circle%n", x, y);    }
    
}
}
