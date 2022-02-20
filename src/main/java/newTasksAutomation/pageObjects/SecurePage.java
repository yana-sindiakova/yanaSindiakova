package newTasksAutomation.pageObjects;

import io.qameta.allure.Step;
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

    @Step("Verify alert text")
    public String getSuccessAlertText() {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
        return successAlert.getText();
    }

    @Step("Click [Logout] button")
    public LoginPage logout() {
        clickButton(logoutButton);
        return new LoginPage(driver);
    }
}
