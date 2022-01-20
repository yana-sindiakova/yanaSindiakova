package HomeWork15PO;

import org.testng.annotations.Test;

public class TableDom extends BaseTest {
    @Test
    public void testTable() {
        openApp().goToChallengingDomPage()
                .clickBlueButton()
                .clickRedButton()
                .clickGreenButton()
                .showColumnByNumber(4);

    }
}
