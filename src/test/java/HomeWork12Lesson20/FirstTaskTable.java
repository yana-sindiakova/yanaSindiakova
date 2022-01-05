package HomeWork12Lesson20;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstTaskTable {
    private WebDriver driver;

    @BeforeMethod
    public void beforeExecution() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
    }

    @AfterMethod
    public void afterExec() {
        driver.quit();
    }

    @Test
    public void getElements() {
        WebElement blueButton = driver.findElement(By.xpath("//*[@class='button']"));
        blueButton.click();

        WebElement redButton = driver.findElement(By.xpath("//*[@class='button alert']"));
        redButton.click();
        WebElement greenButton = driver.findElement(By.xpath("//*[@class='button success']"));
        greenButton.click();


        List<WebElement> columnElements = driver.findElements(By.xpath("//*[@class='large-10 columns']//tr/td"));
        List<String> column4 = new ArrayList<>();
        for (int i = 3; i < columnElements.size(); i = i + 7) {
            column4.add(columnElements.get(i).getText());
        }
        System.out.println("Elements from the column #4 " + column4);
    }
}
