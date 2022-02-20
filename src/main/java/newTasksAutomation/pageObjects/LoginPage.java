package newTasksAutomation.pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(className = "radius")
    private WebElement loginButton;

    @FindBy(id = "flash")
    private WebElement alert;

    @Step("Enter userName")
    public LoginPage setUsername(String username) {
        webDriverWait.until(ExpectedConditions.visibilityOf(usernameInput));
        usernameInput.sendKeys(username);
        return this;
    }

    @Step("Enter password")
    public LoginPage setPassword(String password) {
        webDriverWait.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.sendKeys(password);
        return this;
    }

    @Step("Click [Login] button")
    public void clickLoginButton() {
        clickButton(loginButton);
    }

    public SecurePage successLogin() {
        this.setUsername("tomsmith");
        this.setPassword("SuperSecretPassword!");
        this.clickLoginButton();
        return new SecurePage(driver);
    }

    @Step("Verify alert text")
    public String getAlertText() {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("flash")));
        return alert.getText();
    }

}
