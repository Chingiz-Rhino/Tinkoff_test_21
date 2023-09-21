package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class RemoteTestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.tinkoff.ru/";
        Configuration.pageLoadStrategy = "eager";

        Configuration.browserSize = System.getProperty("browserSize");
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.browserVersion = System.getProperty("browserVersion");


        Configuration.holdBrowserOpen = false;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNS", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;

    }
    @BeforeEach
    void addListener(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachment(){
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

        closeWebDriver();
    }
}
