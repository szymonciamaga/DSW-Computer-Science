package programming.task_14;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread first = new MyThread("First");
        MyThread second = new MyThread("Second");
        MyThread third = new MyThread("Third");
        MyThread fourth = new MyThread("Third");
        MyThread fifth = new MyThread("Fifth");

        first.start();
        second.start();
        third.start();
        fourth.start();
        fifth.start();
        first.join();
        second.join();
        third.join();
        fourth.join();
        fifth.join();
    }
}
