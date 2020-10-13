import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class AdditionTest {

    @DataProvider(name = "Values for addition")
    public Object[][] valuesForAddition() {
        return new Object[][]{
                {0, 0, 0},
                {1, 1, 2},
                {0, -1, -1},
                {-1.5, 3.5, 2},
        };
    }

    @Test(dataProvider = "Values for addition", priority = 1, invocationCount = 2, description = "Проверка операции сложения", retryAnalyzer = RetryAnalyzer.class)
    public void addTest1(double x, double y, double expectedResult) {
        double addResult = Calculator.addition(x, y);
        Assert.assertEquals(addResult, expectedResult);
    }
}
