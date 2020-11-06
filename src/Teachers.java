import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Teachers implements Talkable {
    private static final Queue<Teacher> teachers = new ArrayBlockingQueue<>(4);

    public static Teacher getTeacher() {
        return teachers.poll();
    }

    public static void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public void greetings() {
        System.out.println("Hello class, " + this + ", let's do roll call");
    }

    @Override
    public void goodbye() {
        System.out.println("Goodbye everyone, have a good day!");
    }
}