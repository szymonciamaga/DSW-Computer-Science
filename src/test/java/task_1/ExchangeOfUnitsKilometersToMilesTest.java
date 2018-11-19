package task_1;

import categories.Easy;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import programming.task_19.Calculator;

import java.util.Arrays;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ExchangeOfUnitsKilometersToMilesTest {
    private Calculator calculator;
    @Parameters(name = "{index}: {0}km = {1}mils")
    public static Iterable<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {100d, 62.137d},
                {200d, 124.274d},
                {0d, 0d},
                {0.1, 0.0621d},
                {0.25, 0.1553d}
        });
    }

    @Parameter(value = 0)
    public double kilometers;
    @Parameter(value = 1)
    public double exceptedValue;

    @Before
    public void prepare() {
        calculator = new Calculator();
    }

    @Test
    @Category(Easy.class)
    public void resultsShouldBeCorrect() {
        double miles = calculator.convertKilometersToMiles(kilometers);
        assertEquals(exceptedValue, miles, 0.0001);
    }
}
