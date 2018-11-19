package task_1;

import categories.Complicated;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import programming.task_19.Calculator;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class ExchangeOfFahrenheitToCelsiusTest {
    private Calculator calculator;
    @Parameters(name = "{index}: {0}fahr = {1}cels")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {212d, 100d},
                {0d, -17.7d},
                {-15, -26.1}
        });
    }

    @Parameter(value = 0)
    public double value;
    @Parameter(value = 1)
    public double exceptedValue;

    @Before
    public void prepare() {
        calculator = new Calculator();
    }

    @Test
    @Category(Complicated.class)
    public void convertFahrenheitToCelsius() {
        double celsius = calculator.convertFahrenheitToCelsius(value);
        assertEquals(exceptedValue, celsius, 0.1);
    }
}
