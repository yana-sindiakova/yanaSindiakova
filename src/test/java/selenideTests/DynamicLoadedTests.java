package selenideTests;


import newTasksAutomation.selenidePO.DynamicLoadedPage1;
import newTasksAutomation.selenidePO.DynamicLoadedPage2;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadedTests extends BaseTestSelenide {
    @Test(priority = 10)
    public void hiddenElementTest() {
        DynamicLoadedPage1 dynamicLoaderPage1 = openApp().goToDynamicLoadingPage()
                .goToHiddenElementExample()
                .clickStartButton();
        String hiddenElementText = dynamicLoaderPage1.getHiddenMessageText();
        Assert.assertTrue(hiddenElementText.contains("Hello World!"));
    }

    @Test(priority = 20)
    public void absentElementTest() {
        DynamicLoadedPage2 dynamicLoaderPage2 = openApp().goToDynamicLoadingPage()
                .goToAbsentElementExample()
                .clickStartButton();
        String hiddenElementText = dynamicLoaderPage2.getAbsentElementText();
        Assert.assertTrue(hiddenElementText.contains("Hello World!"));
    }
}
