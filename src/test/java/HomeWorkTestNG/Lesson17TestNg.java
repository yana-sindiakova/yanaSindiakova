package HomeWorkTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Lesson17TestNg {
    @Test(description = "Test for login with valid credentials",
            groups = "Login",
            dataProvider = "Credentials",
            priority = 10)
    public void login(String name, String password, String role) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(role, "manager", "User is not a manager");

        softAssert.assertAll();
    }

    @DataProvider(name = "Credentials")
    public Object[][] getCredential() {
        String[][] users = {
                {"user1", "pass1", "user"},
                {"user2", "pass2", "admin"},
                {"user3", "pass3", "guest"} // "manager" for success Login
        };
        return users;
    }

    @Test(description = "Test depends on Login test",
            priority = 30,
            dependsOnGroups = "Login")
    public void dependsTest() {
        System.out.println("You will see this message if Login test passed");
    }

    @Test(description = "Test with parameter from the configuration",
            priority = 50)
    @Parameters("env")
    public void showParameter(String paramFromConf) {
        System.out.println("This parameter from outside = " + paramFromConf);
    }
}


