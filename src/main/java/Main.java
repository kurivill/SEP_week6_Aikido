import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student user = new Student();
        while (true) {
            System.out.println("==== Aikido Tracker ====");
            System.out.println("Press 1 to add practice session");
            System.out.println("Press 2 to view total practice time");
            System.out.println("Press 3 to check if you can graduate");
            System.out.println("Press 4 to quit");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the number of minutes you practiced:");
                    int minutes = scanner.nextInt();
                    user.addPracticeSession(minutes);
                    break;

                case 2:
                    System.out.println(user.totalTrainingTime());
                    break;

                case 3:
                    user.checkGraduation();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    return;
            }

        }
    }
}
