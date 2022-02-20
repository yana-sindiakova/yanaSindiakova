package newTasksAutomation.selenidePO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.Arrays;
import java.util.Scanner;

import static com.codeborne.selenide.Selenide.$x;

public class DynamicLoadedPage2 {
    private SelenideElement startButton = $x("//div[@id='start']/button");
    private SelenideElement absentElement = $x("//div[@id='finish']/h4");

    public DynamicLoadedPage2 clickStartButton() {
        startButton.should(Condition.visible).shouldBe(Condition.enabled).click();
        return this;
    }

    public String getAbsentElementText() {
        return absentElement.should(Condition.visible).getText();
    }

}
