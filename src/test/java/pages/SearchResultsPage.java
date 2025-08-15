package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    @Step("Проверить, что в результатах есть автор '{expectedAuthor}'")
    public SearchResultsPage verifyAuthorInResults(String expectedAuthor) {
        $$(".book-preview__author").first().shouldHave(text(expectedAuthor));
        return this;
    }

    @Step("Проверить наличие книги с названием '{title}' в результатах")
    public SearchResultsPage verifyBookInResults(String title) {
        $$(".book-preview__title").findBy(text(title)).shouldBe(visible);
        return this;
    }
}
