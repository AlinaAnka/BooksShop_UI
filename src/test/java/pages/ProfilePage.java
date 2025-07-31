package pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProfilePage {

    public ProfilePage openProfilePage() {
        open("/user/cabinet/");
        return this;
    }

    public ProfilePage checkHeader() {
        $(".page-header__title").shouldBe(visible)
                .shouldHave(text("Личный кабинет"));
        return this;
    }

    public void verifyEmail(String expectedEmail) {
        $("#E-mail").shouldHave(value(expectedEmail));
    }
}
