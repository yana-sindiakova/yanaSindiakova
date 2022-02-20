package newTasksAutomation.pageObjects;


import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingDomPageLink;

    @FindBy(linkText = "Form Authentication")
    private WebElement loginPageLink;

    @FindBy(linkText = "Geolocation")
    private WebElement geolocationPageLink;

    @FindBy(linkText = "Hovers")
    private WebElement hoversPageLink;

    @FindBy(linkText = "File Upload")
    private WebElement uploadPageLink;

    @FindBy(linkText = "File Download")
    private WebElement downloadPageLink;


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ChallengingDomPage goToChallengingDomPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(challengingDomPageLink));
        challengingDomPageLink.click();
        return new ChallengingDomPage(driver);
    }

    @Step("Go to Login Page")
    public LoginPage goToLoginPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(loginPageLink));
        loginPageLink.click();
        return new LoginPage(driver);
    }

    public GeolocationPage goToGeolocationPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(geolocationPageLink));
        geolocationPageLink.click();
        return new GeolocationPage(driver);
    }

    public HoversPage goToHoversPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(hoversPageLink));
        hoversPageLink.click();
        return new HoversPage(driver);
    }

    public UploadPage goToUploadPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(uploadPageLink));
        uploadPageLink.click();
        return new UploadPage(driver);
    }

    public DownloadPage goToDownloadPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(downloadPageLink));
        downloadPageLink.click();
        return new DownloadPage(driver);
    }


}
