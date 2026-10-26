/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3q4;

/**
 *
 * @author LENOVO
 */
import java.util.Random;
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random dice = new Random();

        int p1First = dice.nextInt(6) + 1;  
        int p1Second = dice.nextInt(6) + 1;
        int p2First = dice.nextInt(6) + 1;
        int p2Second = dice.nextInt(6) + 1;

        int player1 = p1First + p1Second;
        int player2 = p2First + p2Second;

        System.out.println("Player 1 rolls " + p1First + " and " + p1Second + ": " + player1);
        System.out.println("Player 2 rolls " + p2First + " and " + p2Second + ": " + player2);

        if (player1 > player2) {
            System.out.println("Player 1 wins!");
        } else if (player2 > player1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");    }
    
}
}
