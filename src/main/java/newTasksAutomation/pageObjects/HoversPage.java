package newTasksAutomation.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class HoversPage extends BasePage {

    public HoversPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "figure")
    private List<WebElement> userList;

    public List<String> getUserName() {
        int elemIndex = 1;
        List <String> userNames = new ArrayList<>();
        for (WebElement userIcon : userList) {
            actions.moveToElement(userIcon).perform();
            By userNameLocator = By.xpath("(//*[@id='content']//h5)[" + elemIndex + "]");
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(userNameLocator));
            userNames.add(driver.findElement(userNameLocator).getText());
            elemIndex++;
        }
        return userNames;

    }
}
