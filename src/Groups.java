import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Groups implements Talkable {
    private static final int STUDYGROUPS = 4;
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