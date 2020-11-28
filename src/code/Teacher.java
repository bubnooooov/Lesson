package code;

public class Teacher extends Teachers {
    private final String name;
    private final String profile;

    public Teacher(String name, String profile) {
        this.name = name;
        this.profile = profile;
        Teachers.addTeacher(this);
    }

    @Override
    public String toString() {
        return "My name is " + name + " and I am teacher " + profile;
    }
}