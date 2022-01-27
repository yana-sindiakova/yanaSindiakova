package HomeWork15PO;

import newTasksAutomation.PageObjects.GeolocationPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Geolocation extends BaseTest {
    @Test
    public void locationTest() {
        GeolocationPage geolocationPage = openApp().goToGeolocationPage()
                .clickLocationButton();
        String latitudeText = geolocationPage.getLatitudeValue();
        String longitudeText = geolocationPage.getLongitudeValue();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(latitudeText, "50.4798007");
        softAssert.assertEquals(longitudeText, "30.6020642");
        softAssert.assertAll();

    }
}
