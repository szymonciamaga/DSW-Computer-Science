package programming.task_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promień ");
        r = scanner.nextDouble();
        Main.calc(r);
    }

    private static void calc(double r) {
        double p = 4 * Math.pow(r, 2);
        double v = 4.0 / 3.0  * Math.PI * Math.pow(r, 3);
        System.out.println("Pole powierzchni kuli: " + p + "π"
                + "\nObjętość kuli " + v + "π");
    }
}