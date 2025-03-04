
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Task 1: ");

        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        System.out.print("Task 2: ");

        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");



        System.out.print("Task 3: ");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");



        System.out.print("Task 4: ");

        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");



        System.out.println("Task 5: ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Task 6:");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();



        System.out.println("Task 7:");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
