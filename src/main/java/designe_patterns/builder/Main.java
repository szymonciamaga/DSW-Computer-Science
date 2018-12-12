package designe_patterns.builder;

public class Main {
    public static void main(String[] args) {

        Employee employeeBuilder = new Employee.Builder()
                .name("Richard")
                .surname("Hendrix")
                .old(25)
                .country("USA")
                .adress("Wall Street")
                .phone("827388233")
                .profession("Programmer")
                .postalCode("32-231")
                .city("San Francisco")
                .salary("25000$")
                .section("It")
                .build();

        System.out.println(employeeBuilder);
    }
}
