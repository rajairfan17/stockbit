package id.stockbit.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasePageObject {

    // Elements - Title
    public SelenideElement titleSmsNotification = $x("//div[contains(text(),'SMS Verification')]");

    // Elements - Buttons
    public SelenideElement buttonRegisterWithEmail = $x("//a[2][@class='loginlogin register-email']");

}
