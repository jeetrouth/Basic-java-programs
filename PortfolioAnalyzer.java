import java.util.Scanner;

public class PortfolioAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your skills (comma separated):");
        String skillsInput = sc.nextLine();
        String[] skills = skillsInput.split(",");

        System.out.println("Enter your projects (comma separated):");
        String projectsInput = sc.nextLine();
        String[] projects = projectsInput.split(",");

        System.out.println("Enter your achievements (comma separated):");
        String achievementsInput = sc.nextLine();
        String[] achievements = achievementsInput.split(",");

        int score = calculateScore(skills.length, projects.length, achievements.length);

        System.out.println("\n=== " + name + "'s Portfolio ===");
        System.out.println("Skills: " + String.join(", ", skills));
        System.out.println("Projects: " + String.join(", ", projects));
        System.out.println("Achievements: " + String.join(", ", achievements));
        System.out.println("Portfolio Score: " + score + "/100");

        if (score > 85) {
            System.out.println("🏆 Excellent portfolio!");
        } else if (score > 65) {
            System.out.println("💪 Good portfolio! Keep adding projects.");
        } else {
            System.out.println("🚀 Needs improvement! Build more projects.");
        }

        sc.close();
    }

    // Function to calculate portfolio score
    public static int calculateScore(int skillCount, int projectCount, int achievementCount) {
        int score = skillCount * 8 + projectCount * 10 + achievementCount * 12;
        score += (int)(Math.random() * 16); // random bonus 0-15
        return Math.min(score, 100);
    }
}
