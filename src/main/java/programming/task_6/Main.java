package programming.task_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double MAX_PRICE = 50000;
        double price = 0;
        int installment = 0;
        do {
            System.out.print("Podaj cene towaru: ");
            price = scanner.nextDouble();

            if (price > MAX_PRICE) {
                System.out.println("Cena jest za wysoka maskymalna cena to " + MAX_PRICE + " podaj ponownie cene " +
                        "towaru");
            }

        } while (price > MAX_PRICE);
        System.out.print("Podaj liczbę rat: ");
        installment = scanner.nextInt();
        double calc = calc(price, installment);
        System.out.println("Twoja rata " + calc + "zł");
    }

    public static double calc(double price, int installment) {
        double answer = 0;
        if (installment <= 12) {
            answer = price * 1.03 / installment;
        } else if (installment >= 13 && installment <= 24) {
            answer = price * 1.06 / installment;
        } else if (installment >= 25 && installment <= 48) {
            answer = price * 1.10 / installment;
        } else {
            System.out.println("Błąd: Nieprawidłowa liczba rat minimalna liczba rat to 1 a maksymalna 48");
        }
        return answer;
    }
}