package programming.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}