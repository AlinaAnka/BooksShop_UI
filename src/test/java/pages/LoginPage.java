package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    private SelenideElement
            emailInput = $("#Email"),
            passwordInput = $("#Password"),
            submitButton = $("button[type='submit']"),
            errorMessage = $(".validation-summary-errors");

    public LoginPage openLoginPage() {
        open("/user/login/");
        return this;
    }

    public LoginPage setEmail(String email) {
        emailInput.shouldBe(visible).setValue(email);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordInput.shouldBe(visible).setValue(password);
        return this;
    }

    public LoginPage submit() {
        submitButton.click();
        return this;
    }

    public void verifyErrorMessage(String text) {
        errorMessage.shouldBe(visible).shouldHave(text(text));
    }
}
