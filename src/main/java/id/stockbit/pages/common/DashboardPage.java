package id.stockbit.pages.common;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class DashboardPage {
    // Elements - Title
    public SelenideElement titleStockbitDashboard = $x("//h1[contains(text(),'Investasi Saham Bersama')]");

    // Elements - Buttons
    public SelenideElement buttonSignUp = $x("//div[2]/div/div[2]/div/div[2]/a[@class='register-lnd']");

}
