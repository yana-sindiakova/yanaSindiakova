package HomeWork15PO;

import org.testng.annotations.Test;

public class Hovers extends BaseTest {
    @Test
    public void showUserName() {
        openApp().goToHoversPage()
                .getUserName();
    }
}
