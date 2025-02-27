package project;
import java.util.Random;
import java.util.Scanner;

    public class RockPaperScissor {

        public static void main(String[] args) {
            // Create Scanner object to get user input
            Scanner scanner = new Scanner(System.in);
            // Create Random object to generate computer's choice
            Random random = new Random();

            String[] choices = {"Rock", "Paper", "Scissors"};

            while (true) {
                // Ask the user to choose Rock, Paper, or Scissors
                System.out.println("Enter Rock, Paper, or Scissors (or 'exit' to quit): ");
                String userChoice = scanner.nextLine().trim();

                // Check if user wants to exit
                if (userChoice.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting the game. Goodbye!");
                    break;
                }

                // Validate user input
                if (!userChoice.equalsIgnoreCase("Rock") &&
                        !userChoice.equalsIgnoreCase("Paper") &&
                        !userChoice.equalsIgnoreCase("Scissors")) {
                    System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
                    continue;
                }

                // Generate the computer's choice
                int computerChoiceIndex = random.nextInt(3);
                String computerChoice = choices[computerChoiceIndex];

                // Display choices
                System.out.println("You chose: " + userChoice);
                System.out.println("Computer chose: " + computerChoice);

                // Determine the winner
                if (userChoice.equalsIgnoreCase(computerChoice)) {
                    System.out.println("It's a tie!");
                } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                        (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                        (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }

                System.out.println(); // For better formatting
            }

            scanner.close();
        }
    }

