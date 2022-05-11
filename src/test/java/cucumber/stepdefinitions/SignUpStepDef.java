package cucumber.stepdefinitions;

import com.codeborne.selenide.Driver;
import id.stockbit.core.utility.SeleniumConfig;
import id.stockbit.helper.SeleniumHelper;
import id.stockbit.pages.BasePageObject;
import id.stockbit.pages.common.DashboardPage;
import id.stockbit.pages.common.SignUpPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.*;

public class SignUpStepDef extends SeleniumHelper {

    private final BasePageObject basePageObject = new BasePageObject();
    private final SignUpPage signUpPage = new SignUpPage();
    private final DashboardPage dashboardPage = new DashboardPage();

    @Given("Go To Stockbit Website")
    public void goToStockbitWebsite() {
        SeleniumConfig.initConfiguration();
        writeLog("Load configuration from Selenium Config");
        open(stockbitUrl);
        dashboardPage.titleStockbitDashboard.shouldBe(exist);
    }

    @And("Click SignUp Button")
    public void clickSignUpButton() {
        dashboardPage.buttonSignUp.click();
    }

    @When("User register with email")
    public void userRegisterWithEmail() {
        basePageObject.buttonRegisterWithEmail.click();
    }

    @And("User input username {string}")
    public void userInputUsername(String username) {
        signUpPage.inputUsername.setValue(username);
    }

    @And("User input Name {string}")
    public void userInputName(String name) {
        signUpPage.inputName.setValue(name);
    }

    @And("User input email {string}")
    public void userInputEmail(String email) {
        signUpPage.inputEmail.setValue(email);
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
        signUpPage.inputPassword.setValue(password);
    }

    @And("User input confirm password {string}")
    public void userInputConfirmPassword(String confirmPassword) {
        signUpPage.inputConfirmPassword.setValue(confirmPassword);
    }

    @And("User click register button")
    public void userClickRegisterButton() {
        signUpPage.buttonRegister.click();
        sleep(600);
//        Alert alert = switchTo().alert();
//        alert.dismiss();
//        sleep(600);
    }

    @Then("User successfully submit data")
    public void userSuccessfullySubmitData() {
        basePageObject.titleSmsNotification.exists();
    }
}
