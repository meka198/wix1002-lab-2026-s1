/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2q4;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int total = in.nextInt();

        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;

        System.out.println(total + " seconds is " + hours + " hours, "
                + minutes + " minutes and " + seconds + " seconds");    
    }
    
}
