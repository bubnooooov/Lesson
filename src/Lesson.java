import java.util.Queue;

public class Lesson {
    private static final Object lock = new Object();
    public Lesson(Teachers teacher, Queue group) {
        Lesson(teacher, group);
    }

    private void Lesson(Teachers teacher, Queue group) {
        synchronized (lock) {
            System.out.println("Lesson has started");
            teacher.greetings();
            for (Object std : group) System.out.println(std);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Lesson has been finished");
            teacher.goodbye();
        }
    }
}