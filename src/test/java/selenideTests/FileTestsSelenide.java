package selenideTests;

import com.codeborne.selenide.SelenideElement;
import newTasksAutomation.selenidePO.DownloadPage;
import newTasksAutomation.selenidePO.UploadPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileTestsSelenide extends BaseTestSelenide {

    @Test
    public void fileActions() throws IOException {

        List<String> lines = new ArrayList<>();
        lines.add("HomeWork 17 - Selenide");
        lines.add("Lesson 27");

        DownloadPage downloadPage = openApp().goToDownloadPage();
        SelenideElement randomFile = downloadPage.getRandomFile();
        File file = downloadPage.downloadFile(randomFile);
        Path path = file.toPath();
        Files.write(path, lines);

        UploadPage uploadPage = openApp().goToUploadPage()
                .chooseFile(file)
                .clickUploadButton();

        String uploadedFileName = uploadPage.getUploadedFileText();
        String successUploadMessage = uploadPage.getSuccessUploadMessageText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(uploadedFileName, file.getName(), "File name is not match!");
        softAssert.assertTrue(successUploadMessage.contains("File Uploaded!"), "File is not Uploaded!");
        softAssert.assertAll();
    }
}
