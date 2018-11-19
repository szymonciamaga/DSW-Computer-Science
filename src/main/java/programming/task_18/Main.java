package programming.task_18;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.prepare();
        machine.showItems();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wybierz produkt: ");
        int productId = scanner.nextInt();
        Product product = machine.getProducts().get(productId);
        System.out.print("Wybrałeś " + product.getName() + "\nWrzuć " + product.getPrice() + "zł: ");
        BigDecimal amount = scanner.nextBigDecimal();
        BigDecimal rest = machine.amountVerify(product.getPrice(), amount);
        machine.spendProductAndRest(rest);
    }
}
