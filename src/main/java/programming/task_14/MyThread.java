package programming.task_14;

import java.util.Random;

public class MyThread extends Thread {
    private static int QUANTITY = 100;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= QUANTITY; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " " + i);
            sleepRandomTime();
        }
    }

   private void sleepRandomTime() {
        sleep(new Random().nextInt(1000));
    }

   private void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
