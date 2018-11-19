package programming.task_13;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static final int REGISTER = 1;
    private static final int NEXT_PATIENT = 2;
    private static final int EXIT = 3;
    private static final String HELLO = "@@@@@@@@@@@@@@@\nWitamy w przychodni\nPogodne życie\n@@@@@@@@@@@@@@@\n";
    private static final String OPTION = "Wybierz opcję: ";
    private static final String OPTIONS = "1) Rejestracja nowego pacjenta\n2) Wywołanie kolejnego pacjenta\n";

    public static void main(String[] args) {
        LinkedList<Patient> patients = new LinkedList<>();
        int option = 0;
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println(HELLO);

        while (run) {
            System.out.println(OPTIONS);
            System.out.print(OPTION);
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException e) {
                run = false;
            }
            switch (option) {
                case REGISTER:
                    register(patients, scanner);
                    break;
                case NEXT_PATIENT:
                    Patient patient = patients.poll();
                    if (patient == null) {
                        System.out.println("Kolejka jest pusta!");
                    } else if (patient.getFirstName().charAt(patient.getFirstName().length()-1) == 'a') {
                        System.out.println("Następna w kolejce jest Pani\n" + patient + "\n");
                    } else {
                        System.out.println("Następny w kolejce jest Pan\n" + patient + "\n");
                    }
                    break;
                case EXIT:
                    run = false;
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
            }
        }
    }

    private static void register(LinkedList<Patient> patients, Scanner scanner) {
        System.out.println("Witamy w rejestracji prosimy uzupełnić dane:\n");
        scanner.nextLine();
        System.out.print("Imię: ");
        String firstName = scanner.nextLine();
        System.out.println("\n");
        System.out.print("Nazwisko: ");
        String familyName = scanner.nextLine();
        System.out.print("Pesel");
        String pesel = scanner.nextLine();
        System.out.print("Telefon:");
        String phone = scanner.nextLine();
        patients.offer(new Patient(firstName, familyName, pesel, phone));
        System.out.println("Zostałeś poprawnie zarejestrowany!\nJesteś " + patients.size() + " w kolejce\n");
    }
}