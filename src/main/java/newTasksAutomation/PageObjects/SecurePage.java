package newTasksAutomation.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SecurePage extends BasePage {

    public SecurePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "flash")
    private WebElement successAlert;

    @FindBy(css = ".icon-2x.icon-signout")
    private WebElement logoutButton;

    public String getSuccessAlertText() {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
        return successAlert.getText();
    }

    public LoginPage logout() {
        clickButton(logoutButton);
        return new LoginPage(driver);
    }
}
