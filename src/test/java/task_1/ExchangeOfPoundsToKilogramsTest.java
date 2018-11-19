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
public class ExchangeOfPoundsToKilogramsTest {
    private Calculator calculator;
    @Parameters(name = "{index}: {0}pou = {1}kg")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {110, 50d},
                {63, 29 },
                {0, 0}
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
    public void convertPoundsToKilograms() {
        double kilograms = calculator.convertPoundsToKilograms(value);
        assertEquals(exceptedValue, kilograms, 1);
    }
}
