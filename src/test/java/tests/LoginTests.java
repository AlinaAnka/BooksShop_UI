package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ProfilePage;

import static io.qameta.allure.Allure.step;

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
    void successfulLogin() {

        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });

        step("Переходим на страницу авторизации", () -> {
            loginPage.openLoginPage();
        });

        step("Вводим email и пароль", () -> {
            loginPage.setEmail(config.email())
                    .setPassword(config.password());
        });

        step("Нажимаем кнопку 'Войти'", () -> {
            loginPage.submit();
        });

        step("Проверяем данные в профиле", () -> {
            profilePage.openProfilePage()
                    .checkHeader()
                    .verifyEmail(config.email());
        });
    }

    @Test
    @Story("Обработка ошибок авторизации")
    @DisplayName("Авторизация с неверным паролем")
    @Severity(SeverityLevel.NORMAL)
    void loginWithWrongPassword() {
        step("Открываем страницу авторизации", () -> {
            loginPage.openLoginPage();
        });

        step("Вводим неверный пароль", () -> {
            loginPage.setEmail(config.email())
                    .setPassword("wrong_password");
        });

        step("Проверяем сообщение об ошибке", () -> {
            loginPage.submit();
            loginPage.verifyErrorMessage("Неверный логин или пароль");
        });
    }

    @Test
    @Story("Обработка ошибок авторизации")
    @DisplayName("Авторизация с неверным email")
    @Severity(SeverityLevel.NORMAL)
    void loginWithWrongEmail() {
        step("Открываем страницу авторизации", () -> {
            loginPage.openLoginPage();
        });

        step("Вводим неверный email", () -> {
            loginPage.setEmail("wrong_email")
                    .setPassword(config.password());
        });

        step("Проверяем сообщение об ошибке", () -> {
            loginPage.submit();
            loginPage.verifyErrorMessage("Неверный логин или пароль");
        });
    }
}