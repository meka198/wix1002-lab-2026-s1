/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q3;

/**
 *
 * @author LENOVO
 */
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int a = (int) (Math.random() * 41) + 10;   // 10..50 inclusive
        int b = (int) (Math.random() * 41) + 10;
        int c = (int) (Math.random() * 41) + 10;
        int sum = a + b + c;
        double avg = sum / 3.0;

        System.out.println("Numbers: " + a + ", " + b + ", " + c);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", avg);    
    }
    
}
