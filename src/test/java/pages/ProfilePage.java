package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProfilePage {

    @Step("Открыть страницу профиля")
    public ProfilePage openProfilePage() {
        open("/user/cabinet/");
        return this;
    }

    @Step("Проверить заголовок страницы профиля")
    public ProfilePage checkHeader() {
        $(".page-header__title").shouldBe(visible)
                .shouldHave(text("Личный кабинет"));
        return this;
    }

    @Step("Проверить email пользователя: '{expectedEmail}'")
    public void verifyEmail(String expectedEmail) {
        $("#E-mail").shouldHave(value(expectedEmail));
    }
}
