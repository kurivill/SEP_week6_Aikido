import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    Student user = new Student();

    @Test
    void testAddPracticeSession() {
        user.addPracticeSession(10);
        assertEquals(1, user.getSessions());
    }

    @Test
    void testTotalTrainingTime() {
        user.addPracticeSession(10);
        assertEquals("Total training time: 10 minutes", user.totalTrainingTime());
        user.addPracticeSession(60);
        assertEquals("Total training time: 1 hours, 10 minutes", user.totalTrainingTime());
    }

    @Test
    void testCheckGraduation() {
        user.addPracticeSession(90);
        user.checkGraduation();
        assertEquals("Too early to graduate", user.checkGraduation());
        while (user.getSessions() < 100) {
            user.addPracticeSession(10);
        }
        assertEquals("Congratulations! You can graduate!", user.checkGraduation());
    }
}