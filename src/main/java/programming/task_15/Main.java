package programming.task_15;

public class Main {
    private static final int AMOUNT_ELEMENTS = 100000000;
    private static int[] randomArray() {
        int[] outArray = new int[AMOUNT_ELEMENTS];
        for (int i = 0; i < outArray.length; i++) {
            outArray[i] = (int)(Math.random()*10);
        }
        return outArray;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arrayA = randomArray();
        int[] arrayB = randomArray();
        int[] arrayC = new int[AMOUNT_ELEMENTS];
        long stop = System.currentTimeMillis();
        System.out.println("Finished allocating: " + (stop - start));
        Thread firstThread = new Thread(() -> {
            for (int i = 0; i < AMOUNT_ELEMENTS; i++) {
                arrayC[i] = arrayA[i];
            }
        });
        firstThread.start();
        try {
            Thread secondThread = new Thread(() -> {
                for (int i = 0; i < AMOUNT_ELEMENTS; i++) {
                    arrayC[i] += arrayB[i];
                }
            });
            secondThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long start2 = System.currentTimeMillis();
        System.out.println("With threads: " + (start2 - stop));
        for (int i = 0; i < AMOUNT_ELEMENTS; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }
        long stop3 = System.currentTimeMillis();
        System.out.println("Without threads: " + (stop3 - start2));
    }
}
