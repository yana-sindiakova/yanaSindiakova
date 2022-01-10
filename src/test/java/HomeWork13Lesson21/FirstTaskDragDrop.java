package HomeWork13Lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTaskDragDrop {
    private WebDriver driver;

    @BeforeMethod
    public void beforeExecution() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
    }

    @AfterMethod
    public void afterExec() {
        driver.quit();
    }

    @Test
    public void dragDrop() {
        WebElement elementToDrag = driver.findElement(By.id("draggable"));
        WebElement areaToDrop = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);
        action.dragAndDrop(elementToDrag, areaToDrop).perform();

        Assert.assertEquals(areaToDrop.getText(), "Dropped!");
    }
}
