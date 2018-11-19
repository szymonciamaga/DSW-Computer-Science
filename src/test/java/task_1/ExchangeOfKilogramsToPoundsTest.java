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
public class ExchangeOfKilogramsToPoundsTest {
    private Calculator calculator;
    @Parameters(name = "{index}: {0}kg = {1}pou")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {50d, 110d},
                {5100, 11243d},
                {29, 63},
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
    public void convertKilogramsToPounds() {
        double pounds = calculator.convertKilogramsToPounds(value);
        assertEquals(exceptedValue, pounds, 1);
    }
}
