package programming.task_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int ADD = 1;
        final int SUBTRACTION = 2;
        final int MULTIPLICATION = 3;
        final int DIVIDE = 4;
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("Witamy w kalkulatorze " +
                "\n wybierz co chcesz zrobić: " +
                "\n1. Dodawanie" +
                "\n2. Odejmowanie" +
                "\n3. Mnożenie" +
                "\n4. Dzielenie");
        System.out.print("Podaj opcję: ");
        option = scanner.nextInt();
        System.out.print("Podaj pierwszą liczbę: ");
        a = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        b = scanner.nextDouble();
        switch (option) {
            case ADD:
                show(a + b);
                break;
            case SUBTRACTION:
                break;
            case MULTIPLICATION:
                show(a * b);
                break;
            case DIVIDE:
                show(a / b);
                break;
            default:
                System.out.println("Taka opcja nie istnieje !");
                break;
        }
    }

    private static void show(double answer) {
        System.out.println("Odpowiedź: " + answer);
    }
}

