package programming.task_18;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public static final class Builder {
        private String name;
        private BigDecimal price;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Product build() {
            if (name.isEmpty()) {
                throw new IllegalArgumentException();
            }
            Product product = new Product();
            product.name = this.name;
            product.price = this.price;
            return product;
        }
    }

    @Override
    public String toString() {
        return name + " " + price + "zł";
    }
}
