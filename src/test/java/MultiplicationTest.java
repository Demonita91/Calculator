import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class MultiplicationTest {

    @DataProvider(name = "Values for multiplication")
    public Object[][] valuesForAddition() {
        return new Object[][]{
                {0, 0, 0},
                {1, 1, 1},
                {0, -1, 0},
                {3, 2.5, 7.5},
        };
    }

    @Test(dataProvider = "Values for multiplication", priority = 1, invocationCount = 2, description = "Проверка операции умножения", retryAnalyzer = RetryAnalyzer.class)
    public void addTest1(double x, double y, double expectedResult) {
        double addResult = Calculator.multiplication(x, y);
        Assert.assertEquals(addResult, expectedResult);
    }
}
