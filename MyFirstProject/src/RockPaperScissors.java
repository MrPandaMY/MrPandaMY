import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

         // ROCK PAPER SCISSORS GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String PlayerChoice;
        String ComputerChoice;
        String PlayAgain = "yes";


        do {
            System.out.print("Enter your move (Rock, Paper, Scissors): ");
            PlayerChoice = scanner.nextLine().toLowerCase();

            if (!PlayerChoice.equals("rock") && !PlayerChoice.equals("paper") && !PlayerChoice.equals("scissors")) {
                System.out.println("Invalid choice!");
                continue;
            }

            ComputerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choose: " + ComputerChoice);

            if (PlayerChoice.equals(ComputerChoice)) {
                System.out.println("It's a tie!");
            }
            else if ((PlayerChoice.equals("rock") && ComputerChoice.equals("scissors") ||
                    (PlayerChoice.equals("paper") && ComputerChoice.equals("rock")) ||
                    (PlayerChoice.equals("scissors") && ComputerChoice.equals("paper")))) {

                System.out.println("You WIN!");
            }

            else {
                System.out.println("You LOSE!");
            }

            System.out.print("Do you want to play again? (Yes/No): ");
            PlayAgain = scanner.nextLine().toLowerCase();


        } while (PlayAgain.equals("yes"));

        System.out.println("Thanks for playing! See you again.");


        scanner.close();
    }
}
