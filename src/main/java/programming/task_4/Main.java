package programming.task_4;

import java.util.Scanner;

public class Main {
    private static final int MAX_NUMBERS = 5;

    public static void main(String[] args) {
        int i = 0;
        int max = 0;
        Scanner input = new Scanner(System.in);
        while (i <= MAX_NUMBERS - 1) {
            System.out.print("Podaj " + (i + 1) + " liczbę: ");
            int number = input.nextInt();
            if (i == 0) {
                max = number;
            }
            max = check(max, number);
            i++;
        }

        System.out.println("Największa liczba to: " + max);
    }

    private static int check(int x, int y) {
        if (x >= y) {
            return x;
        }
        return y;
    }
}