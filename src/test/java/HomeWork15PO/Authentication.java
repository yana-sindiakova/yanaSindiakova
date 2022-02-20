package HomeWork15PO;

import newTasksAutomation.pageObjects.LoginPage;
import newTasksAutomation.pageObjects.SecurePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Authentication extends BaseTest {
    @Test(priority = 10)
    public void validLoginTest() {
        openApp().goToLoginPage()
                .setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();

        SecurePage securePage = new SecurePage(driver);

        String loginAlertText = securePage.getSuccessAlertText();
        Assert.assertTrue(loginAlertText.contains("You logged into a secure area!"));

    }

    @Test(priority = 20) // Failed test for Allure report
    public void invalidLoginTest() {
        openApp().goToLoginPage()
                .setUsername("wrongName")
                .setPassword("wrongPassword")
                .clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);

        String errorAlertText = loginPage.getAlertText();
        Assert.assertTrue(errorAlertText.contains("Your username is tralala!")); // changed expected message to simulate test failing
    }

    @Test(priority = 30)
    public void logout() {
        String logoutAlertText = openApp().goToLoginPage()
                .successLogin()
                .logout()
                .getAlertText();
        Assert.assertTrue(logoutAlertText.contains("You logged out of the secure area!"));
    }


}
