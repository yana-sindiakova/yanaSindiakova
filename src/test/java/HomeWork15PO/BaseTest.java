package HomeWork15PO;

import io.github.bonigarcia.wdm.WebDriverManager;
import newTasksAutomation.PageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void beforeExecution() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", new File("target/download").getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void afterExec() {
        driver.quit();
    }

    public MainPage openApp() {
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage(driver);
    }
}
