package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchResultsPage;

@Epic("Поиск книг")
@Feature("Функционал поиска")
@Owner("Алина")
@Tag("web")
public class SearchTests extends TestBase {

    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Test
    @Story("Поиск книг по критериям")
    @DisplayName("Поиск книги по автору")
    @Severity(SeverityLevel.NORMAL)
    void searchBookByAuthorTest() {
        String authorName = "Достоевский";

        mainPage.openMainPage()
                .searchFor(authorName);
        searchResultsPage.verifyAuthorInResults(authorName);
    }

    @Test
    @Story("Успешный поиск книги по точному названию")
    @DisplayName("Поиск книги по названию")
    @Severity(SeverityLevel.NORMAL)
    void searchAnnaKareninaBookTest() {

        String bookTitle = "Анна Каренина";

        mainPage.openMainPage()
                .searchFor(bookTitle);
        searchResultsPage.verifyBookInResults(bookTitle);
    }
}
