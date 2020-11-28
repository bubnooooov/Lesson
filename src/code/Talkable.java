package code;

public interface Talkable {
    void greetings();
    default void goodbye() {
        System.out.println("Goodbye");
    };
}