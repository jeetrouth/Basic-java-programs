import java.util.Scanner;

/**
 * A simple program to check if a given number is prime.
 * This program demonstrates:
 * - User input handling
 * - Basic mathematical operations
 * - Loop usage
 * - Conditional statements
 */
public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Prime Number Checker!");
        System.out.print("Enter a positive number to check if it's prime: ");
        
        int number = scanner.nextInt();
        
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a prime number!");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }
}