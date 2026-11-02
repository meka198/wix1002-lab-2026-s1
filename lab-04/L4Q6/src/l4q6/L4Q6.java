/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q6;

/**
 *
 * @author LENOVO
 */
import java.util.Random;
public class L4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(Integer.MAX_VALUE);   

        int digits = 0;
        int remaining = number;
        do {                       
            digits++;
            remaining /= 10;
        } while (remaining != 0);

        System.out.println("Number: " + number);
        System.out.println("Number of digits: " + digits);    
    }
    
}
