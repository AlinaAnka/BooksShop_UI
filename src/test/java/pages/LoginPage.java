package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

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

    @Step("Открыть страницу авторизации")
    public LoginPage openLoginPage() {
        open("/user/login/");
        return this;
    }

    @Step("Ввести email '{email}'")
    public LoginPage setEmail(String email) {
        emailInput.shouldBe(visible).setValue(email);
        return this;
    }

    @Step("Ввести пароль")
    public LoginPage setPassword(String password) {
        passwordInput.shouldBe(visible).setValue(password);
        return this;
    }

    @Step("Нажать кнопку входа")
    public LoginPage submit() {
        submitButton.click();
        return this;
    }

    @Step("Проверить сообщение об ошибке: '{text}'")
    public void verifyErrorMessage(String text) {
        errorMessage.shouldBe(visible).shouldHave(text(text));
    }
}
