package programming.task_19;

public class Calculator {
    private static final double UNIT_MILES = 0.62137;
    private static final double UNIT_KILOMETERS = 1.61;
    private static final double UNIT_FAHRENHEIT =1.8;
    private static final double UNIT_POUNDS = 2.2046;

    public void showMenu () {
        System.out.println("@@@@@@@@@@@@ Menu @@@@@@@@@@@@\n" +
                "1. Kilometers to miles\n" +
                "2. Miles to kilometers\n" +
                "3. Celsius degrees to fahrenheit\n" +
                "4. Fahrenheit degres to celsius\n" +
                "5. Kilograms to pounds\n" +
                "6. Pounds to kilograms");
    }

    public double convertKilometersToMiles(double numberOfKilometers) {
        if (numberOfKilometers < 0)
            throw new IllegalArgumentException();
        return numberOfKilometers * UNIT_MILES;
    }

    public double convertMilesToKilometers(double mils) {
        if (mils < 0)
            throw new IllegalArgumentException();
        return mils * UNIT_KILOMETERS;
    }

    public double convertCelsiusToFahrenheit(double celsius) {
        return UNIT_FAHRENHEIT * celsius + 32;
    }

    public double convertFahrenheitToCelsius(double fahrenheit) {
        return 5.0 / 9 * (fahrenheit - 32);
    }

    public double convertKilogramsToPounds(double kg) {
        return kg * UNIT_POUNDS;
    }

    public double convertPoundsToKilograms(double pounds) {
        return pounds * 0.454;
    }
}
