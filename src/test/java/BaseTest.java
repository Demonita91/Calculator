import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Start calculation");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("Finish calculation");
    }
}
