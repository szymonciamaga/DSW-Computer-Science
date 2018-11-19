package task_1;

import categories.Complicated;
import org.junit.Rule;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import org.junit.rules.ExpectedException;
import programming.task_19.Calculator;

@RunWith(Parameterized.class)
public class ExchangeOfUnitsKilometersToMilesComplexityPolicyNegativeTest {
    private Calculator calculator;
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Parameters(name = "{index}")
    public static Iterable<Object[]> dataTest() {
        return Arrays.asList(new Object[][] {
                {-5},
                {-0.25},
                {-0.1}
        });
    }

    @Parameter(value = 0)
    public double value;

    @Before
    public void prepare() {
        calculator = new Calculator();
        expectedException.expect(IllegalArgumentException.class);
    }

    @Test
    @Category(Complicated.class)
    public void shouldBeThrowExceptionForKilometersAFewZero() throws IllegalArgumentException {
        double result = calculator.convertKilometersToMiles(value);
    }
}
