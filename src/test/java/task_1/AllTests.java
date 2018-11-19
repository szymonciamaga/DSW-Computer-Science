package task_1;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({
        ExchangeOfUnitsMilesToKilometersComplexityPolicyNegativeTest.class,
        ExchangeOfUnitsKilometersToMilesTest.class,
        ExchangeOfUnitsMilesToKilometersTest.class,
        ExchangeOfUnitsKilometersToMilesTest.class,
        ExchangeOfFahrenheitToCelsiusTest.class})
public class AllTests {
}
