import java.util.Scanner;

public class Indexfind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("Enter the index: ");
        int index = sc.nextInt();

        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);

        if(index < 0 || index > str.length()){
            System.out.println("Invalid Index!");
        }
        else{
            char find = str.charAt(index);
            if(find == ch){
                System.out.println("Found the character "+ch+" at index "+ index);
            }
            else{
                System.out.println("Sorry the character isn't available");
            }
        }
    }
}
