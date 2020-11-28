package code;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Process {

    /*
    два статических блока для инициализации
    четырех групп и учителей
     */

    static {
        new Teacher("Joe Biden", "Political science");
        new Teacher("Donald Trump", "Sociology");
        new Teacher("Barack Obama", "Economy");
        new Teacher("George Bush", "Social Studies");
    }

    static {
        new Group("republicans");
        new Group("democrats");
        new Group("constitutions");
        new Group("self-nominations");
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) executorService.submit(new Study());
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);
    }


    private static class Study implements Runnable {
        @Override
        public void run() {
            new Lesson(Teachers.getTeacher(), Groups.getGroup());
        }
    }
}