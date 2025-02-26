import java.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private int sessions;
    private LocalDate firstSession;
    private int trainingMinutes;
    private ArrayList<LocalDate> trainingDays;

    public Student() {
        sessions = 0;
        firstSession = LocalDate.now();
        trainingDays = new ArrayList<>();
    }

    public void addPracticeSession(int minutes) {
        sessions++;
        trainingMinutes += minutes;
        trainingDays.add(LocalDate.now());
    }

    public String totalTrainingTime() {
        if (trainingMinutes < 60) {
            return "Total training time: " + trainingMinutes;
        } else {
            int hours = trainingMinutes / 60;
            int minutes = trainingMinutes % 60;
            return "Total training time: " + hours + " hours, " + minutes + " minutes";
        }
    }

    public void checkGraduation() {
        if (LocalDate.now().isAfter(firstSession.plusMonths(6)) || sessions >= 100) {
            System.out.println("You can graduate");
        } else {
            System.out.println("Too early to graduate");
        }
    }
}
