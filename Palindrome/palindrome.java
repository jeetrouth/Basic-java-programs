import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String line = sc.nextLine();
        StringBuffer rev = new StringBuffer(line).reverse();

        if(rev.toString().equals(line)){
            System.out.println("Palindrome found!");
        }
        else{
            System.out.println("String isn't a palindrome");
        }
    }
}
