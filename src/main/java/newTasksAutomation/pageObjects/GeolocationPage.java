package newTasksAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GeolocationPage extends BasePage {


    public GeolocationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[text()='Where am I?']")
    private WebElement locationButton;

    @FindBy(id = "lat-value")
    private WebElement latitudeValue;

    @FindBy(id = "long-value")
    private WebElement longitudeValue;

    @FindBy(linkText = "See it on Google")
    private WebElement googleLink;

    public GeolocationPage clickLocationButton() {
        clickButton(locationButton);
        return this;
    }

    public String getLatitudeValue() {
        webDriverWait.until(ExpectedConditions.visibilityOf(latitudeValue));
        return this.latitudeValue.getText();
    }

    public String getLongitudeValue() {
        webDriverWait.until(ExpectedConditions.visibilityOf(longitudeValue));
        return this.longitudeValue.getText();
    }

    public void clickGoggleLink() {
        googleLink.click();
    }


}
