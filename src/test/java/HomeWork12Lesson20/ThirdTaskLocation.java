package HomeWork12Lesson20;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ThirdTaskLocation {
    private WebDriver driver;

    @BeforeMethod
    public void beforeExecution() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/geolocation");
    }

    @AfterMethod
    public void afterExec() {
        driver.quit();
    }

    @Test
    public void getLocation() {
        WebElement locationButton = driver.findElement(By.xpath("//*[text()='Where am I?']"));
        locationButton.click();
        waitSleep(4000);

        WebElement latitudeValue = driver.findElement(By.xpath("//*[@id='lat-value']"));
        WebElement longitudeValue = driver.findElement(By.xpath("//*[@id='long-value']"));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(latitudeValue.getText(), "50.4798007");
        softAssert.assertEquals(longitudeValue.getText(), "30.6020642");
    }

    public void waitSleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException | NoAlertPresentException e) {
            e.printStackTrace();
        }
    }

}
