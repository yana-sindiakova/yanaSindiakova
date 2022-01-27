package HomeWork16Lesson26;

import HomeWork15PO.BaseTest;
import newTasksAutomation.PageObjects.DownloadPage;
import newTasksAutomation.PageObjects.UploadPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileTest extends BaseTest {

    @Test
    public void fileAction() throws IOException {

        List<String> lines = new ArrayList<>();
        lines.add("HomeWork 16");
        lines.add("Lesson 26");

        DownloadPage downloadPage = openApp().goToDownloadPage();

        String randomFileName = downloadPage.downloadFile();

        String filePath = downloadPage.waitForFileDownload(randomFileName);

        Path path = Paths.get(filePath);

        Files.write(path, lines);

        SoftAssert softAssert = new SoftAssert();

        UploadPage uploadPage = openApp().goToUploadPage()
                .chooseFile(new File(filePath).getAbsolutePath())
                .clickUploadButton();

        String uploadedFileName = uploadPage.getUploadedFileText();
        String successUploadMessage = uploadPage.getSuccessUploadMessageText();

        softAssert.assertEquals(uploadedFileName, randomFileName, "File name is not match!");
        softAssert.assertTrue(successUploadMessage.contains("File Uploaded!"), "File is not Uploaded!");

        softAssert.assertAll();

    }
}
