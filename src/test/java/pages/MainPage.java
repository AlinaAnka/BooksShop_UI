package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private SelenideElement
            searchInput = $(".header__main__search__form__text"),
            submitButton = $(".header__main__search__form__submit");

    @Step("Открыть главную страницу")
    public MainPage openMainPage() {
        open("/");
        return this;
    }

    @Step("Выполнить поиск по запросу '{query}'")
    public MainPage searchFor(String query) {
        searchInput.setValue(query);
        submitButton.click();
        return this;
    }
}
