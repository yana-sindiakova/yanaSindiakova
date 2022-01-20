package HomeWork15PO;

import org.testng.annotations.Test;

import java.util.List;

public class Hovers extends BaseTest {
    @Test
    public void showUserName() {
        List<String> userNames = openApp().goToHoversPage()
                .getUserName();

        System.out.println(userNames);

    }
}
