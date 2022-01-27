package newTasksAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UploadPage extends BasePage {
    public UploadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "file-upload")
    private WebElement fileInput;

    @FindBy(id = "file-submit")
    private WebElement uploadButton;

    @FindBy(id = "uploaded-files")
    private WebElement uploadedFilePanel;

    @FindBy(css = "div.example h3")
    private WebElement successUploadMessage;

    public UploadPage chooseFile(String filePath) {
        fileInput.sendKeys(filePath);
        return this;
    }

    public UploadPage clickUploadButton() {
        clickButton(uploadButton);
        return this;
    }

    public String getUploadedFileText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(uploadedFilePanel));
        return uploadedFilePanel.getText();
    }

    public String getSuccessUploadMessageText() {
        webDriverWait.until(ExpectedConditions.visibilityOf(successUploadMessage));
        return successUploadMessage.getText();
    }


}
