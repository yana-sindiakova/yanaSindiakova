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

public class SecondTaskDropdown {
    private WebDriver driver;

    @BeforeMethod
    public void beforeExecution() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
    }

    @AfterMethod
    public void afterExec() {
        driver.quit();
    }

    @Test
    public void dropDownCheck() {
        WebElement dropdown = driver.findElement(By.className("dropdown-toggle"));
        dropdown.click();

        WebElement dropdownItem = driver.findElement(By.xpath("//*[@class='secondary-dropdown']/a[@class='dropdown-toggle']"));

        Actions action = new Actions(driver);
        action.moveToElement(dropdownItem).perform();

        WebElement secondDropdownItem = driver.findElement(By.xpath("//*[contains(text(), 'Secondary Action')]"));
        action.moveToElement(secondDropdownItem).click().perform();

        WebElement pageText = driver.findElement(By.cssSelector("div.jumbotron.secondary-clicked"));

        Assert.assertTrue(pageText.getText().contains("Secondary Page"));

    }
}
