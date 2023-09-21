package base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class RemoteTestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.tinkoff.ru/";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1980x1200";

    }
}
