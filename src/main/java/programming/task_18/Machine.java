package programming.task_18;

import java.math.BigDecimal;
import java.util.*;

public class Machine {
    private static final String SPEND_PRODUCT_MESSAGE = "Wydawanie produktu....";
    private HashMap<Integer, Product> products;
    private Scanner input;
    private static final String CONFIRM = "t";
    private static final String REJECTION = "n";
    private BigDecimal amount = BigDecimal.ZERO;
    public HashMap<Integer, Product> getProducts() {
        return products;
    }

    public void showItems() {
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }

    public void prepare() {
        products = new HashMap<>();
        Product product = new Product.Builder()
                .name("Sprite")
                .price(new BigDecimal(2.5))
                .build();
        Product product1 = new Product.Builder()
                .name("Cola")
                .price(new BigDecimal(4.5))
                .build();
        Product product2 = new Product.Builder()
                .name("7Days")
                .price(new BigDecimal(5))
                .build();
        Product product3 = new Product.Builder()
                .name("Juice")
                .price(new BigDecimal(6.5))
                .build();
        products.put(1, product);
        products.put(2, product1);
        products.put(3, product2);
        products.put(4, product3);
    }

    public boolean confirmationPerformance() {
        input = new Scanner(System.in);
        boolean result = false;
        System.out.print("Czy jesteś pewny\nt/n: ");
        String reply = input.nextLine();
        switch (reply) {
            case CONFIRM:
                result = true;
                break;
            case REJECTION:
                rejectOperation();
                break;
            default:
                throw new IllegalArgumentException("This replay is incorrect");
        }
        return result;
    }

    private void rejectOperation() {
        System.out.println("Odrzucenie operacji");
        System.out.println("Wydanie pieniędzy...\n" + amount + "zł");
    }

    public BigDecimal amountVerify(BigDecimal price, BigDecimal amount) {
        BigDecimal result = BigDecimal.valueOf(0);
        amount = verificationUnderpayment(price, amount);
        if (amount.compareTo(price) == 0)
            return result;
        if (amount.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Enter correct amount");
        if (amount.compareTo(price) > 0)
            result = amount.subtract(price);
        return result;
    }

    public void spendProductAndRest(BigDecimal rest) {
        if (confirmationPerformance()) {
            if (rest.compareTo(BigDecimal.ZERO) == 0) {
                System.out.println(SPEND_PRODUCT_MESSAGE);
            } else if (rest.compareTo(BigDecimal.ZERO) > 0) {
                System.out.println("Wydaje resztę " + rest);
                System.out.println(SPEND_PRODUCT_MESSAGE);
            }
        }
    }

    private BigDecimal verificationUnderpayment(BigDecimal price, BigDecimal oldAmount) {
        boolean flag = false;
        amount = oldAmount;
        if (oldAmount.compareTo(price) < 0) {
            input = new Scanner(System.in);
            while (!flag) {
                System.out.print("Proszę o dopłatę brakuje jeszcze " + price.subtract(oldAmount) + "zł ");
                oldAmount = oldAmount.add(input.nextBigDecimal());
                if (oldAmount.compareTo(price) >= 0) {
                    flag = true;
                }
            }
        }
        amount = oldAmount;
        return amount;
    }
}
