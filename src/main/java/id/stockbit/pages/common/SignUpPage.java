package id.stockbit.pages.common;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SignUpPage {
    // Elements - Input
    public SelenideElement inputName = $x("//input[@id='input-1']");
    public SelenideElement inputEmail = $x("//input[@id='input-2']");
    public SelenideElement inputUsername = $x("//input[@id='input-3']");
    public SelenideElement inputPassword = $x("//input[@id='input-4']");
    public SelenideElement inputConfirmPassword = $x("//input[@id='input-5']");

    // Elements - Buttons
    public SelenideElement buttonRegister = $x("//input[@value='Register']");
}
