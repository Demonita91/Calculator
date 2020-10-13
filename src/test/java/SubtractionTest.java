import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class SubtractionTest {

    @DataProvider(name = "Values for subtraction")
    public Object[][] valuesForAddition() {
        return new Object[][]{
                {0, 0, 0},
                {2, 1, 1},
                {0, -1, 1},
                {-1.5, 3.5, -5},
        };
    }

    @Test(dataProvider = "Values for subtraction", priority = 1, invocationCount = 2, description = "Проверка операции вычитания", retryAnalyzer = RetryAnalyzer.class)
    public void addTest1(double x, double y, double expectedResult) {
        double addResult = Calculator.subtraction(x, y);
        Assert.assertEquals(addResult, expectedResult);
    }
}
