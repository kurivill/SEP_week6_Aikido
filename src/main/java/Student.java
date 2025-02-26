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
            return "Total training time: " + trainingMinutes + " minutes";
        } else {
            int hours = trainingMinutes / 60;
            int minutes = trainingMinutes % 60;
            return "Total training time: " + hours + " hours, " + minutes + " minutes";
        }
    }

    public String checkGraduation() {
        if (LocalDate.now().isAfter(firstSession.plusMonths(6)) || sessions >= 100) {
            return "Congratulations! You can graduate!";
        } else {
            return "Too early to graduate";
        }
    }

    public void setSessions(int sessions) {
        this.sessions = sessions;
    }

    public int getSessions() {
        return sessions;
    }

    public void setTrainingMinutes(int trainingMinutes) {
        this.trainingMinutes = trainingMinutes;
    }

    public int getTrainingMinutes() {
        return trainingMinutes;
    }
}
