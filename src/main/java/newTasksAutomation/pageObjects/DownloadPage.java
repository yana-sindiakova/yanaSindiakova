package newTasksAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class DownloadPage extends BasePage {
    public DownloadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='example']/a")
    private List<WebElement> filesList;

    public List<WebElement> getTextFilesList() {
        return filesList.stream().filter((e) -> e.getText().contains("txt")).collect(Collectors.toList());
    }

    public WebElement getRandomFile() {
        List<WebElement> textFilesList = this.getTextFilesList();
        return textFilesList.get((int) (Math.random() * textFilesList.size()));
    }

    public String downloadFile() {
        WebElement randomFile = getRandomFile();
        clickButton(randomFile);
        return randomFile.getText();
    }

    public String waitForFileDownload(String fileName) {
        String path = "target/download/" + fileName;
        int attemp = 0;
        do {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (++attemp > 10) {
                throw new RuntimeException("File is not downloaded");
            }
        } while (!new File(path).exists());
        return path;
    }


}
