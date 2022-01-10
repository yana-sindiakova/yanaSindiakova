package HomeWork13Lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ThirdTaskHover {
    private WebDriver driver;

    @BeforeMethod
    public void beforeExecution() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
    }

    @AfterMethod
    public void afterExec() {
        driver.quit();
    }

    @Test
    public void showUsers() {
        List<WebElement> userList = driver.findElements(By.className("figure"));
        Actions action = new Actions(driver);
        int elemIndex = 1;
        for (WebElement userIcon : userList) {
            action.moveToElement(userIcon).perform();
            String userName = driver.findElement(By.xpath("(//*[@id='content']//h5)[" + elemIndex + "]")).getText();
            System.out.println(userName);
            elemIndex++;
        }
    }
}

