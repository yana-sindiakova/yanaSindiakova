package newTasksAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ChallengingDomPage extends BasePage {

    public ChallengingDomPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "button")
    private WebElement blueButton;

    @FindBy(css = ".button.alert")
    private WebElement redButton;

    @FindBy(css = ".button.success")
    private WebElement greenButton;

    @FindBy(xpath = "//*[@class='large-10 columns']//tr/td")
    private List<WebElement> columnElements;

    public ChallengingDomPage clickBlueButton() {
        clickButton(blueButton);
        return this;
    }

    public ChallengingDomPage clickRedButton() {
        clickButton(redButton);
        return this;
    }

    public ChallengingDomPage clickGreenButton() {
        clickButton(greenButton);
        return this;
    }

    public List<String> showColumnByNumber(int columnNumber) {
        List<String> column = new ArrayList<>();
        for (int i = columnNumber - 1; i < columnElements.size(); i = i + 7) {
            column.add(columnElements.get(i).getText());
        }
        return column;
    }


}
