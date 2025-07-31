package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    public SearchResultsPage verifyAuthorInResults(String expectedAuthor) {
        $$(".book-preview__author").first().shouldHave(text(expectedAuthor));
        return this;
    }

    public SearchResultsPage verifyBookInResults(String title) {
        $$(".book-preview__title").findBy(text(title)).shouldBe(visible);
        return this;
    }
}
