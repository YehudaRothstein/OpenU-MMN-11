import java.util.Scanner;

/**
 * @author Yehuda Rothstein - 329671333
 * @version 11.7.2024
 * This is a Class For a Rock, Paper, Scissors Game.
 */
public class Game {
    public static void main(String[] args) {
        // Players Choises
        char player1, player2 ;
        //make Scanner Object
        Scanner scanner = new Scanner(System.in);
        //Get First Player's Choise
        System.out.println("Enter first player's object:");
        player1 = scanner.next().charAt(0);
        //Get Second Player's Choise
        System.out.println("Enter second player's object:");
        player2 = scanner.next().charAt(0);

        // Checks If First players choise if Scissors
        if (player1 == 'S'){
            if (player2 == 'R'){
                System.out.println("Player 2 wins.");
            } else if (player2 == 'P') {
                System.out.println("Player 1 wins.");
            } else {
                System.out.println("Game ends with a tie.");
            }
            // Checks If First players choise if Rock
        } else if (player1 == 'R'){
            if (player2 == 'S'){
                System.out.println("Player 1 wins.");
            } else if (player2 == 'P') {
                System.out.println("Player 2 wins.");
            } else {
                System.out.println("Game ends with a tie.");
            }
            // Checks If First players choise if Paper (the last option)
        } else {
            if (player2 == 'R') {
                System.out.println("Player 1 wins.");
            } else if (player2 == 'S') {
                System.out.println("Player 2 wins.");
            } else {
                System.out.println("Game ends with a tie.");
            }
        }
    }
}