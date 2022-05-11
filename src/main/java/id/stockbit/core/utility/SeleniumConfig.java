package id.stockbit.core.utility;

import com.codeborne.selenide.Configuration;
import id.stockbit.core.variables.GenericVariables;

public class SeleniumConfig implements GenericVariables {
    public static void initConfiguration() {
        Configuration.browser = browser;
        Configuration.startMaximized = Boolean.parseBoolean(maximizedWindow);
        Configuration.screenshots = Boolean.parseBoolean(screenshotConfig);
        Configuration.savePageSource = Boolean.parseBoolean(pageSource);
        Configuration.timeout = Long.parseLong(timeout);
    }
}
