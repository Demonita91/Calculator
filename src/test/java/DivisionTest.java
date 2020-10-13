import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Listeners(TestListener.class)
public class DivisionTest extends BaseTest {

    @DataProvider(name = "Values for division")
    public Object[][] inputsForSum() {
        return new Object[][]{
                {10, 5, 2},
                {0, 3, 0},
                {7.5, 7.5, 1},
                {-5, 5, -1},

        };
    }

    @Test(dataProvider = "Values for division", priority = 2, invocationCount = 2, description = "Проверка операции деления", retryAnalyzer = RetryAnalyzer.class)
    public void division(double x, double y, double expectedResult) {
        double result = Calculator.division(x, y);
        assertEquals(result, expectedResult);
    }

    @Test(description = "Проверка операции деления на ноль", expectedExceptions = ArithmeticException.class, priority = 1, retryAnalyzer = RetryAnalyzer.class, invocationCount = 2)
    public void divTest2() {
        Calculator.division(10, 0);
    }
}