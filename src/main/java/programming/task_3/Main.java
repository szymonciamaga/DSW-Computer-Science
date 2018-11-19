package programming.task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);

        int acomulator = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Podaj " + (i + 1) + " liczbę całkowitą: ");
            numbers[i] = scanner.nextInt();
            if (numbers[i] > acomulator) {
                acomulator = numbers[i];
            }
        }

        System.out.println("Największa liczba to: " + acomulator);
    }
}