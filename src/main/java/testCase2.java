import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author Pankaj Kumar
 * @since 5/22/2021
 */
public class testCase2 {
    @Test()
    public void beforeTest3() {
        System.out.println("Before test3");
    }

    @Test()
    public void beforeTest4() {
        System.out.println("Before test4");
    }

    @BeforeSuite
    public void beforeSuiteName() {
        System.out.println("Before suite");
    }

    @AfterSuite
    public void afterSuiteName() {
        System.out.println("After suite");
    }
}
