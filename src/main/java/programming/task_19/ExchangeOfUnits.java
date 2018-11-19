package programming.task_19;

import java.util.Scanner;

public class ExchangeOfUnits {
    private static double kilometers;
    private static double miles;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();
        calc.showMenu();
        System.out.print("Option: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.print("Enter kilometers: ");
                kilometers = input.nextDouble();
                miles = calc.convertKilometersToMiles(kilometers);
                System.out.println(kilometers + " kilometers is " + miles + " miles");
                break;
            case 2:
                System.out.println("Enter miles");
                miles = input.nextDouble();
                kilometers = calc.convertMilesToKilometers(miles);
                System.out.println(miles + " miles is " + kilometers + " kilometers");
                break;
        }
    }
}


