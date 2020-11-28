package code;

public class Student extends Group {
    private final String studentOfGroup;
    private final int id;
    private final int rate;
    private static int i = 1;
    private boolean isLeader;

    public Student(String studentOfGroup) {
        this.studentOfGroup = studentOfGroup;
        id = i++;
        rate = ((int) (Math.random() * 100));
    }

    public int getRate() {
        return rate;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    public static void setI(int i) {
        Student.i = i;
    }

    @Override
    public String toString() {
        if (isLeader) return "Hello, I am leader of group " + studentOfGroup + " and my id is " + id;
        else return "Hello, I am student #" + id + " of group is " + studentOfGroup;
    }
}