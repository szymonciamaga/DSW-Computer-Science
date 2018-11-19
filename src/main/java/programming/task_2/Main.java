package programming.task_2;

import java.util.Scanner;

public class Main {
    private static final String GET_ME = "Podaj ";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(GET_ME + "imię: ");
        String firstName = input.nextLine();
        System.out.print(GET_ME + "nazwisko: ");
        String familyName = input.nextLine();
        System.out.print(GET_ME + "wiek: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print(GET_ME + "pesel: ");
        String pesel = input.nextLine();
        System.out.print(GET_ME + "adres: ");
        String adress = input.nextLine();
        System.out.print(GET_ME + "miasto: ");
        String city = input.nextLine();
        System.out.print(GET_ME + "kod pocztowy: ");
        String postalCode = input.nextLine();
        System.out.print(GET_ME + "numer telefonu: ");
        String phone = input.nextLine();

        Person person = new Person(firstName,
                familyName,
                age, pesel,
                adress,
                city,
                postalCode,
                phone);

        System.out.println(person);
    }
}