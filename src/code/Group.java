package code;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Group extends Groups {
    private static final int GROUPSIZE = 10; // количество учеников в группе
    private final Queue<Student> group = new ArrayBlockingQueue<>(GROUPSIZE);

    public Group() { }
    public Group(String nameGroup) {
        for (int i = 0; i < GROUPSIZE; i++) group.add(new Student(nameGroup));
        setLeaderofGroup(group);
        Groups.addGroup(nameGroup, group);
        Student.setI(1); // чтобы в каждой группе нумерация учеников начиналась с 1
    }

    /*
    алгоритм выбора старосты, исходя из индивидуального rate.
    у кого больше rate - тот староста
     */

    private void setLeaderofGroup(Queue<Student> group) {
        int maxRate = group.iterator().next().getRate();
        for (Student st : group) if (st.getRate() > maxRate) maxRate = st.getRate();
        for (Student st : group) {
            if (st.getRate() == maxRate) {
                st.setLeader(true);
                break;
            }
        }
    }
}