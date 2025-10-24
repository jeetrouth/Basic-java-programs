// Added by: Banisha — Hacktoberfest 2025
// File: Basic-java-programs/banisha/Fibonacci.java
// Description: Prints the first n Fibonacci numbers (n = 10 by default).

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;             // change this to print more/less terms
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : ""));
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // newline
    }
}
