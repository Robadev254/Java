import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rounds: ");
        int rounds = scanner.nextInt();
        int totalScore = 0;
        int secretNumber = 7; // a sample secret number
        
        for (int i = 1; i <= rounds; i++) {
            System.out.printf("Round %d: Enter your lucky number: ", i);
            int luckyNumber = scanner.nextInt();
            int remainder = luckyNumber % secretNumber;
            if (remainder == 0) {
                System.out.println("It's a draw!");
                totalScore++;
            } else if (remainder % 2 == 0) {
                System.out.println("You won!");
                totalScore += 3;
            } else {
                System.out.println("You lost!");
                totalScore -= 3;
            }
        }
        
        if (totalScore > 0) {
            System.out.printf("Congratulations! You won with a score of %d.%n", totalScore);
        } else {
            System.out.printf("Sorry, you lost with a score of %d.%n", totalScore);
        }
        
        scanner.close();
    }
}
