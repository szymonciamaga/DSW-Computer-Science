package programming.task_16;

public class Main {
    private static final int N = 100000000;
    private static int total = 0;
    private static int[] randomArray() {
        int[] outArray = new int[N];
        for (int i = 0; i < N; i++) {
            outArray[i] = (int) (Math.random()*10);
        }
        return outArray;
    }

    public static void main(String[] args) {
        System.out.println("Start allocating....");
        long startAllocatingTime = System.currentTimeMillis();
        int[] array = randomArray();
        long stopAllocatingTime = System.currentTimeMillis();
        System.out.println("Finished allocating " + (stopAllocatingTime - startAllocatingTime));
        long startWithoutThreads = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        long stopWithoutThreads = System.currentTimeMillis();
        System.out.println("Total " + total + "\nTime without threads " + (stopWithoutThreads - startWithoutThreads));
        long startWithThreads = System.currentTimeMillis();
        total = 0;
        System.out.println("*******************************");
        Thread firstThread = new Thread(() -> {
            for (int i = 0; i < array.length; i++) {
                total += array[i];
            }
            System.out.println("Total " + total);
        });
        firstThread.start();
        long stopWithThreads = System.currentTimeMillis();
        System.out.println("Time with threads " + (stopWithThreads - startWithThreads));
    }
}
