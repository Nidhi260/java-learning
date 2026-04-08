package Practice;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorBestOf5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int userChoice, computerChoice;
        int userScore = 0, computerScore = 0;

        System.out.println("===== ROCK PAPER SCISSORS (BEST OF 5) =====");

        for (int round = 1; round <= 5; round++) {

            System.out.println("\n--- Round " + round + " ---");

            System.out.println("Enter your choice:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            userChoice = sc.nextInt();

            // Validate input
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid input! Try again.");
                round--; // repeat same round
                continue;
            }

            // Computer choice
            computerChoice = rand.nextInt(3) + 1;

            // Display choices
            System.out.print("You chose: ");
            if (userChoice == 1) System.out.println("Rock");
            else if (userChoice == 2) System.out.println("Paper");
            else System.out.println("Scissors");

            System.out.print("Computer chose: ");
            if (computerChoice == 1) System.out.println("Rock");
            else if (computerChoice == 2) System.out.println("Paper");
            else System.out.println("Scissors");

            // Game logic
            if (userChoice == computerChoice) {
                System.out.println("Result: DRAW");
            } 
            else if ((userChoice == 1 && computerChoice == 3) ||
                     (userChoice == 2 && computerChoice == 1) ||
                     (userChoice == 3 && computerChoice == 2)) {
                System.out.println("Result: You WIN this round!");
                userScore++;
            } 
            else {
                System.out.println("Result: Computer WINS this round!");
                computerScore++;
            }

            // Show score
            System.out.println("Score => You: " + userScore + " | Computer: " + computerScore);

            // Early win condition
            if (userScore == 3 || computerScore == 3) {
                break;
            }
        }

        // Final result
        System.out.println("\n===== FINAL RESULT =====");
        if (userScore > computerScore) {
            System.out.println("🎉 You WON the game!");
        } else if (computerScore > userScore) {
            System.out.println("💻 Computer WON the game!");
        } else {
            System.out.println("It's a DRAW game!");
        }

        sc.close();
    }
}