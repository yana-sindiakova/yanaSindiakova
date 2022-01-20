package newTasksAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HoversPage extends BasePage {

    public HoversPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "figure")
    private List<WebElement> userList;

    public HoversPage getUserName() {
        int elemIndex = 1;
        for (WebElement userIcon : userList) {
            actions.moveToElement(userIcon).perform();
            By userNameLocator = By.xpath("(//*[@id='content']//h5)[" + elemIndex + "]");
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(userNameLocator));
            String userName = driver.findElement(userNameLocator).getText();
            System.out.println(userName);
            elemIndex++;
        }
        return this;

    }
}
