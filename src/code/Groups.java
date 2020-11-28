package code;

import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Groups implements Talkable {
    private static final int STUDYGROUPS = 4; // максимальное количество групп

    /*
    очередь из групп для последовательного начала уроков (чтобы легче было воспринимать
    и считывать данные с консоли), реализована как Map, где String - название группы,
    Queue - ученики.
    */

    private static final Queue<Map<String, Queue>> groups = new ArrayBlockingQueue<>(STUDYGROUPS);

    public static Queue getGroup() {
        return groups.poll().entrySet().iterator().next().getValue();
    }

    public static void addGroup(String nameGroup, Queue<Student> group) {
        Map<String, Queue> groupMap = new HashMap<>();
        groupMap.put(nameGroup, group);
        groups.add(groupMap);
    }

    @Override
    public void greetings() {
        System.out.println(this);
    }
}