import java.util.Scanner;
public class Game {
    public static void main (String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first player's object:");
        char player1 = scan.next().charAt(0);
        System.out.println("Enter second player's object:");
        char player2 = scan.next().charAt(0);

        if (player1 == 'S' && player2 == 'R'){
            System.out.println("Player 2 wins.");
        }
        if (player1 == 'P' && player2 == 'R'){
            System.out.println("Player 1 wins.");
        }
        if (player1 == 'R' && player2 == 'R'){
            System.out.println("Game ends with a tie.");
        }
    }
}