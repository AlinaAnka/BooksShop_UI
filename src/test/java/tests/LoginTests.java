package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ProfilePage;

@Epic("Авторизация пользователя")
@Feature("Личный кабинет")
@Owner("Алина")
@Tag("web")

public class LoginTests extends TestBase {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    ProfilePage profilePage = new ProfilePage();

    @Test
    @Story("Успешная авторизация")
    @DisplayName("Успешная авторизация с валидными данными")
    @Severity(SeverityLevel.CRITICAL)
    void successfulLoginTest() {

        mainPage.openMainPage();
        loginPage.openLoginPage()
                .setEmail(config.email())
                .setPassword(config.password())
                .submit();
        profilePage.openProfilePage()
                .checkHeader()
                .verifyEmail(config.email());
    }

    @Test
    @Story("Обработка ошибок авторизации")
    @DisplayName("Авторизация с неверным паролем")
    @Severity(SeverityLevel.NORMAL)
    void loginWithWrongPasswordTest() {

        loginPage.openLoginPage()
                .setEmail(config.email())
                .setPassword("wrong_password")
                .submit()
                .verifyErrorMessage("Неверный логин или пароль");
    }

    @Test
    @Story("Обработка ошибок авторизации")
    @DisplayName("Авторизация с неверным email")
    @Severity(SeverityLevel.NORMAL)
    void loginWithWrongEmailTest() {
        loginPage.openLoginPage()
                .setEmail("wrong_email")
                .setPassword(config.password())
                .submit()
                .verifyErrorMessage("Неверный логин или пароль");
    }
}