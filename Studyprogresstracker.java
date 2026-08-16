import java.util.Scanner;

public class StudyProgressTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("      STUDY PROGRESS TRACKER");
        System.out.println("================================");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter subject name: ");
        String subject = input.nextLine();

        System.out.print("Enter total study hours: ");
        double hours = input.nextDouble();

        System.out.print("Enter completed topics: ");
        int completedTopics = input.nextInt();

        System.out.print("Enter total topics: ");
        int totalTopics = input.nextInt();

        double progress =
                ((double) completedTopics / totalTopics) * 100;

        System.out.println("\n---------- STUDY REPORT ----------");

        System.out.println("Student: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Study Hours: " + hours);
        System.out.println("Topics Completed: "
                + completedTopics + "/" + totalTopics);

        System.out.printf("Progress: %.2f%%\n", progress);

        if (progress >= 80) {
            System.out.println("Status: Excellent! 🌟");
        } 
        else if (progress >= 50) {
            System.out.println("Status: Good Progress! 👍");
        } 
        else {
            System.out.println("Status: Keep Working! 💪");
        }

        System.out.println("----------------------------------");
        System.out.println("Keep learning and improving! 🚀");

        input.close();
    }
}