package HomeWork15PO;

import org.testng.annotations.Test;

import java.util.List;

public class TableDom extends BaseTest {
    @Test
    public void testTable() {

        int columnNumber = 4;

        List<String> elementsFromColumn = openApp().goToChallengingDomPage()
                .clickBlueButton()
                .clickRedButton()
                .clickGreenButton()
                .showColumnByNumber(columnNumber);
        System.out.println("Elements from the column #" + columnNumber + " = " + elementsFromColumn);

    }
}
