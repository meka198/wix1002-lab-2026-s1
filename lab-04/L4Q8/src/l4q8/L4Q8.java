/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4q8;

/**
 *
 * @author LENOVO
 */
import java.util.Random;
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(101);
        System.out.println("n =" + n);
        
         int found = 0;
        int candidate = 2;
        while (found < n) {
            boolean prime = true;
            for (int divisor = 2; divisor * divisor <= candidate; divisor++) {
                if (candidate % divisor == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                found++;
                System.out.print(candidate + (found % 10 == 0 ? "\n" : " "));
            }
            candidate++;
        }
        if (n % 10 != 0) {
            System.out.println();
        }
    }
    
}
