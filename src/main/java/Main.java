import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * @author Pankaj Kumar
 * @since 5/22/2021
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        TakesScreenshot TSObj = (TakesScreenshot) driver;

        File image = TSObj.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(image, new File("test.png"));

    }
}
