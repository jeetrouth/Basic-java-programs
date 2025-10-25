import java.util.*;

public class ForttuneTeller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] fortunes = {
            "You will have a great day!",
            "Success is on the horizon.",
            "Expect the unexpected.",
            "Happiness will find you soon.",
            "A thrilling time is in your immediate future."
        };

        System.out.print("Enter your name: ");
        String name = sc.nextLine();


        int randomIndex = rand.nextInt(fortunes.length);
        System.out.println("\nHey " + name + "! Your fortune is: " + fortunes[randomIndex]);

        sc.close();
    }
}
