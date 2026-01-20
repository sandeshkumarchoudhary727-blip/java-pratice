import java.util.*;
public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secNumber = 5; 
        int guess;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 10.");
        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess == secNumber) {
                System.out.println("Correct You guessed the number.");
                break; 
            } else if (guess < 1 || guess > 10) {
                System.out.println(" Invalid Please enter between 1 and 10.");
                continue; 
            } else if (guess < secNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secNumber) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("wrong attempt");
            }
        }
        System.out.println("Game Over Thanks for playing");
        sc.close();
    }
}