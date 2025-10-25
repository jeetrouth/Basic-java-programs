// ================================================================
// StudentUtilityApp.java
// ---------------------------------------------------------------
// Author: Agnibesh Maity
// Description:
//   A complete beginner-friendly Java program that demonstrates
//   multiple basic programming concepts in one place.
//   It allows the user to:
//     1. Calculate Sum of Numbers
//     2. Check Even or Odd
//     3. Find Factorial
//     4. Generate Fibonacci Series
//     5. Display Simple Student Info
// ---------------------------------------------------------------
// Version: 1.0
// Created: October 2025
// ================================================================

import java.util.Scanner;

public class StudentUtilityApp {

    // ------------------------------------------------------------
    // 1. Sum of two numbers
    // ------------------------------------------------------------
    public static void sumOfNumbers(Scanner sc) {
        System.out.println("\n--- SUM OF TWO NUMBERS ---");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("✅ The sum is: " + (a + b));
    }

    // ------------------------------------------------------------
    // 2. Check Even or Odd
    // ------------------------------------------------------------
    public static void checkEvenOdd(Scanner sc) {
        System.out.println("\n--- EVEN OR ODD CHECKER ---");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("✅ " + num + " is Even.");
        else
            System.out.println("✅ " + num + " is Odd.");
    }

    // ------------------------------------------------------------
    // 3. Factorial Calculator
    // ------------------------------------------------------------
    public static void factorialCalculator(Scanner sc) {
        System.out.println("\n--- FACTORIAL CALCULATOR ---");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;

        System.out.println("✅ Factorial of " + n + " = " + fact);
    }

    // ------------------------------------------------------------
    // 4. Fibonacci Series Generator
    // ------------------------------------------------------------
    public static void fibonacciSeries(Scanner sc) {
        System.out.println("\n--- FIBONACCI SERIES GENERATOR ---");
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;
        System.out.print("📘 Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // ------------------------------------------------------------
    // 5. Display Student Information
    // ------------------------------------------------------------
    public static void studentInfo(Scanner sc) {
        sc.nextLine(); // consume newline
        System.out.println("\n--- STUDENT INFORMATION ---");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your department: ");
        String dept = sc.nextLine();
        System.out.print("Enter your roll number: ");
        String roll = sc.nextLine();

        System.out.println("\n🎓 STUDENT PROFILE 🎓");
        System.out.println("--------------------------");
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Roll No.: " + roll);
        System.out.println("--------------------------");
        System.out.println("✨ Welcome, " + name + "! Keep learning and growing.");
    }

    // ------------------------------------------------------------
    // Main Menu
    // ------------------------------------------------------------
    public static void mainMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==============================================");
            System.out.println("🎯 STUDENT UTILITY APP - MULTI PURPOSE TOOL 🎯");
            System.out.println("==============================================");
            System.out.println("1️⃣  Calculate Sum of Two Numbers");
            System.out.println("2️⃣  Check Even or Odd");
            System.out.println("3️⃣  Find Factorial");
            System.out.println("4️⃣  Generate Fibonacci Series");
            System.out.println("5️⃣  Display Student Information");
            System.out.println("6️⃣  Exit");
            System.out.println("----------------------------------------------");
            System.out.print("Enter your choice (1-6): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> sumOfNumbers(sc);
                case 2 -> checkEvenOdd(sc);
                case 3 -> factorialCalculator(sc);
                case 4 -> fibonacciSeries(sc);
                case 5 -> studentInfo(sc);
                case 6 -> System.out.println("\n👋 Exiting... Thank you for using StudentUtilityApp!");
                default -> System.out.println("\n⚠️ Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }

    // ------------------------------------------------------------
    // Program Entry Point
    // ------------------------------------------------------------
    public static void main(String[] args) {
        mainMenu();
    }
}
