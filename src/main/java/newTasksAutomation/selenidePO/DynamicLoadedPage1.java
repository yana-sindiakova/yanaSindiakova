package newTasksAutomation.selenidePO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DynamicLoadedPage1 {
    private SelenideElement startButton = $x("//div[@id='start']/button");
    private SelenideElement hiddenMessage = $x("//div[@id='finish']/h4");

    public DynamicLoadedPage1 clickStartButton() {
        startButton.should(Condition.visible).shouldBe(Condition.enabled).click();
        return this;
    }

    public String getHiddenMessageText() {
        return hiddenMessage.should(Condition.visible).getText();
    }
}
