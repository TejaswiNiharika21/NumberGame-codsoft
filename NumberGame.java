import java.util.Random;
import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100) + 1; 
        int g;
        boolean c = false;
        int a = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number (1-100):");

        while (!c) {
            System.out.print("Your guess: ");
            g = sc.nextInt();
            a++;

            if (g == n) {
                c = true;
                System.out.println("Correct! Attempts: " + a);
            } else if (g < n) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }
        sc.close();
    }
}
