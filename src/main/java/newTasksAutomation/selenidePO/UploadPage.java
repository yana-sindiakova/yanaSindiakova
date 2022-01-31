package newTasksAutomation.selenidePO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class UploadPage {
    private SelenideElement fileInput = $(By.id("file-upload"));
    private SelenideElement uploadButton = $(By.id("file-submit"));
    private SelenideElement uploadedFilePanel = $(By.id("uploaded-files"));
    private SelenideElement successUploadMessage = $("div.example h3");

    public UploadPage chooseFile(File file) {
        fileInput.uploadFile(file);
        return this;
    }

    public UploadPage clickUploadButton() {
        uploadButton.click();
        return this;
    }

    public String getUploadedFileText() {
        return uploadedFilePanel.shouldBe(Condition.visible).getText();
    }

    public String getSuccessUploadMessageText() {
        return successUploadMessage.shouldBe(Condition.visible).getText();
    }


}
