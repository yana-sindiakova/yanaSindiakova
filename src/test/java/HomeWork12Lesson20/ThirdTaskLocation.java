package HomeWork12Lesson20;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

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

        By latitudeLocator = By.id("lat-value");
        By longitudeLocator = By.id("long-value");

        WebDriverWait webDriverWait = new WebDriverWait(driver, 5);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(latitudeLocator));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(longitudeLocator));

        WebElement latitudeValue = driver.findElement(latitudeLocator);
        WebElement longitudeValue = driver.findElement(longitudeLocator);


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(latitudeValue.getText(), "50.4798007");
        softAssert.assertEquals(longitudeValue.getText(), "30.6020642");


    }

}
