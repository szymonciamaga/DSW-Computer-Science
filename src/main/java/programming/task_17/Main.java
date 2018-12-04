package programming.task_17;


public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1. Binary to decimal" +
//                        "\n2. Decimal to binary" +
//                        "\n3. Decimal to Hexadecimal" +
//                        "\nOption: ");
        int option = 4;
        switch (option) {
            case 1:
                int decResult = binaryToDecimal();
                showResult(String.valueOf(decResult));
                break;
            case 2:
                String binaryResult = decimalToBinary();
                showResult(binaryResult);
                break;
            case 3:
                decimalToHexadecimal();
                break;
            case 4:
                hexadecimalToDecimal();
                break;
                default:
                    System.out.println("Incorrect option!");
                    break;
        }
    }

    private static void hexadecimalToDecimal() {
        String value = "4A";
        int base = 16;
        int pow = 0;
        int result = 0;
        for (int i = value.length(); i > 0; i++) {
            if (isInteger(value.charAt(i))) {
                result += Math.pow(base, pow) * Integer.parseInt(String.valueOf(value.charAt(i)));
            } else {
                int thanEight = Integer.parseInt(moreThanEight(String.valueOf(value.charAt(i))));
                System.out.println(Math.pow(base, pow) * thanEight);
                result += Math.pow(base, pow) * thanEight;
            }
            pow++;
        }
        System.out.println("Result " + result);
    }

    private static boolean isInteger(char input) {
        try {
            Integer.parseInt(String.valueOf(input));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static void decimalToHexadecimal() {
        int result = 1500000000;
        int rest = 0;
        String answer = "";
        while (result >= 16) {
            rest = result % 16;
            result /= 16;
            answer += rest >= 10 ? moreThanEight(String.valueOf(rest)) : String.valueOf(rest);
            answer += result >= 10 ? moreThanEight(String.valueOf(result)) : String.valueOf(result);
        }
        showResult(reverseString(answer));
    }

    private static String reverseString(String result) {
        String reverse = "";
        for (int i = result.length() - 1; i >= 0; i--) {
            reverse +=  result.charAt(i);
        }
        return reverse;
    }

    private static String moreThanEight(String number) {
        String result = "";
        switch (number) {
            case "10":
                result = "A";
                break;
            case "11":
                result = "B";
                break;
            case "12":
                result = "C";
                break;
            case "13":
                result = "D";
                break;
            case "14":
                result = "E";
                break;
            case "15":
                result = "F";
                break;
            case "A":
                result = "10";
                break;
            case "B":
                result = "11";
                break;
            case "C":
                result = "12";
                break;
            case "D":
                result = "13";
                break;
            case "E":
                result = "14";
                break;
            case "F":
                result = "15";
                break;
        }
        return result;
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
            temp *= 2;
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
