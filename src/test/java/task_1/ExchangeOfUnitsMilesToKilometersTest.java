package task_1;

import categories.Easy;
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
public class ExchangeOfUnitsMilesToKilometersTest {
    private Calculator calculator;
    @Parameters(name = "{index}: {0}mils = {1}kilometers")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {25d, 40.25d},
                {60d, 96.60},
                {0d, 0d},
                {1, 1.61d},
                {9, 14.49d}
        });
    }

    @Parameter(value = 0)
    public double miles;
    @Parameter(value = 1)
    public double exceptedValue;

    @Before
    public void prepare() {
        calculator = new Calculator();
    }

    @Test
    @Category(Easy.class)
    public void convertMilesToKilometers() {
        double kilometers = calculator.convertMilesToKilometers(miles);
        assertEquals(exceptedValue, kilometers, 0.00001);
    }
}
