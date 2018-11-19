package programming.task_8;

import java.util.Scanner;

public class Main {
    private static final String SHOW = " wyraz ciągu fibonaciego wynosi: ";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long fib = 0;
        long fib1 = 1;
        long fibN;
        System.out.print("Podaj N-ty wyraz ciągu fibonaciego: ");
        fibN = scanner.nextLong();
        if (fibN == 0) {
            System.out.println(fibN + SHOW + 0);
        } else if (fibN == 1) {
            System.out.println(fibN + SHOW + 1);
        } else {
            fibonacci(fib, fib1, fibN);
        }
    }

    private static void fibonacci(long fib, long fib1, long fibN) {
        long temp;
        for (int i = 0; i < fibN - 1; i++) {
            temp = fib1 + fib;
            fib = fib1;
            fib1 = temp;
        }
        System.out.println(fibN + SHOW + fib1);
    }
}
