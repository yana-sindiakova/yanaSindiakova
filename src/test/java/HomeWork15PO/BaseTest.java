package HomeWork15PO;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import newTasksAutomation.pageObjects.MainPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void beforeExecution() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", new File("target/download").getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
    }

    @AfterClass
    public void afterExec() {
        driver.quit();
    }

    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException {
        if (!result.isSuccess()) {
            File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            saveScreenshot(Files.readAllBytes(screenShot.toPath()));
        }
    }

    @Step("Open application")
    public MainPage openApp() {
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage(driver);
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
