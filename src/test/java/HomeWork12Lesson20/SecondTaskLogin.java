package HomeWork12Lesson20;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SecondTaskLogin {
    private WebDriver driver;

    @BeforeMethod
    public void beforeExecution() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @AfterMethod
    public void afterExec() {
        driver.quit();
    }

    @Test (priority = 10)
    public void validLogin() {
        WebElement usernameField = driver.findElement(By.xpath("//*[@id='username']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@class='fa fa-2x fa-sign-in']"));

        usernameField.sendKeys("tomsmith");
        passwordField.sendKeys("SuperSecretPassword!");
        loginButton.click();

        WebElement notification = driver.findElement(By.xpath("//*[@id='flash']"));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
        softAssert.assertTrue(notification.getText().contains("You logged into a secure area!"));
        softAssert.assertAll();
    }

    @Test (priority = 20)
    public void invalidLogin() {
        WebElement usernameField = driver.findElement(By.xpath("//*[@id='username']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//*[@class='fa fa-2x fa-sign-in']"));

        usernameField.sendKeys("wrongUser");
        passwordField.sendKeys("wrongPassword");
        loginButton.click();

        WebElement notification = driver.findElement(By.xpath("//*[@id='flash']"));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/login");
        softAssert.assertTrue(notification.getText().contains("Your username is invalid!"));
        softAssert.assertAll();
    }

}
