package selenideTests;


import com.codeborne.selenide.Configuration;
import newTasksAutomation.selenidePO.MainPage;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;


public class BaseTestSelenide {
    @BeforeMethod
    public void beforeExecution() {
        //Configuration.downloadsFolder = new File("target/download").getAbsolutePath();
        Configuration.downloadsFolder = "target/download";
        Configuration.timeout = 10000; // динамічні елементи з другого завдання зявлялися більше,ніж через 5 секунди.Стандартного часу не вистачало, тести падали
    }

    public MainPage openApp() {
        open("https://the-internet.herokuapp.com/");
        return new MainPage();
    }
}
