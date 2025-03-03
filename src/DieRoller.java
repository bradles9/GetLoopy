import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int rollCount = 0;
            boolean triple = false;

            System.out.println("Roll    Die1   Die2   Die3   Sum");
            System.out.println("----------------- -----------------");

            while (!triple) {
                System.out.print("enter next line for die roll");
                scanner.nextLine();

                rollCount++;
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-7d %-6d %-6d %-6d %-4d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    triple = true;
                }
            }

            System.out.print("You rolled a triple. Again? (yes/no): ");
            String response = scanner.next();
            scanner.nextLine();
            playAgain = response.equals("yes");
        }

        scanner.close();
    }
}
