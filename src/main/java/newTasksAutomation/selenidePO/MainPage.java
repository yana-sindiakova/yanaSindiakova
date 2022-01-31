package newTasksAutomation.selenidePO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement downloadPageLink = $(By.linkText("File Download"));
    private SelenideElement uploadPageLink = $(By.linkText("File Upload"));
    private SelenideElement dynamicLoadingPageLink = $(By.linkText("Dynamic Loading"));

    public DownloadPage goToDownloadPage() {
        downloadPageLink.shouldBe(Condition.visible).click();
        return new DownloadPage();
    }

    public UploadPage goToUploadPage() {
        uploadPageLink.shouldBe(Condition.visible).click();
        return new UploadPage();
    }

    public DynamicLoadedPage goToDynamicLoadingPage() {
        dynamicLoadingPageLink.shouldBe(Condition.visible).click();
        return new DynamicLoadedPage();
    }

}
