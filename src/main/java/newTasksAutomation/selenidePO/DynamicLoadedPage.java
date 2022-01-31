package newTasksAutomation.selenidePO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DynamicLoadedPage {
    private SelenideElement hiddenExampleLink = $x("//a[contains(text(),'Example 1')]");
    private SelenideElement absentExampleLink = $x("//a[contains(text(),'Example 2')]");

    public DynamicLoadedPage1 goToHiddenElementExample() {
        hiddenExampleLink.should(Condition.visible).shouldBe(Condition.enabled).click();
        return new DynamicLoadedPage1();
    }

    public DynamicLoadedPage2 goToAbsentElementExample() {
        absentExampleLink.should(Condition.visible).shouldBe(Condition.enabled).click();
        return new DynamicLoadedPage2();
    }

}
