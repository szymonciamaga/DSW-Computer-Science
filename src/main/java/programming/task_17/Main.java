package programming.task_17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "1. Binary to decimal" +
                "\n2. Decimal to binary" +
                "\nOption: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                int decResult = binaryToDecimal();
                showResult(String.valueOf(decResult));
                break;
            case 2:
                String binaryResult = decimalToBinary();
                showResult(binaryResult);
                break;
                default:
                    System.out.println("Incorrect option!");
                    break;
        }
    }

    private static int binaryToDecimal() {
        String value = "11101";
        int result = 0;
        int temp = 0;
        for (int i = value.length() - 1; i >= 0; i--) {
            if (value.charAt(i) == '1') {
                if (i == value.length() - 1) {
                    result = 1;
                    temp = 1;
                } else {
                    result += temp;
                }
            }
            temp = (temp * 2);
        }
        return result;
    }

    private static String decimalToBinary() {
        String value = "749";
        String temp = "";
        String result = "";
        int dec = Integer.valueOf(value);
        do {
            temp += (dec % 2 == 1) ? "1" : "0";
            dec = (dec / 2);
        } while (dec != 0);
        for (int i = temp.length(); i > 0; i--) {
            result += temp.charAt(i - 1);
        }
        return result;
    }

    private static void showResult(String result) {
        System.out.println("Result: " + result );
    }
}
