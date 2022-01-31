package newTasksAutomation.selenidePO;

import com.codeborne.selenide.SelenideElement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$x;

public class DownloadPage {
    private List<SelenideElement> fileList = $$x("//div[@class='example']/a");

    public List<SelenideElement> getTextFilesList() {
        return fileList.stream().filter((e) -> e.getText().contains("txt")).collect(Collectors.toList());
    }

    public SelenideElement getRandomFile() {
        List<SelenideElement> textFilesList = this.getTextFilesList();
        return textFilesList.get((int) (Math.random() * textFilesList.size()));
    }

    public File downloadFile(SelenideElement element) throws FileNotFoundException {
        return element.download();
    }

}
