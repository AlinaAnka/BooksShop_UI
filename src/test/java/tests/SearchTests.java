package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchResultsPage;

import static io.qameta.allure.Allure.step;

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
    void searchBookByAuthor() {
        String authorName = "Достоевский";

        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });

        step("Ищем книги автора", () -> {
            mainPage.searchFor(authorName);
        });

        step("Проверяем результаты", () -> {
            searchResultsPage.verifyAuthorInResults(authorName);
        });
    }

    @Test
    @Story("Успешный поиск книги по точному названию")
    @DisplayName("Поиск книги по названию")
    @Severity(SeverityLevel.NORMAL)
    void searchAnnaKareninaBook() {

        String bookTitle = "Анна Каренина";

        step("Открываем главную страницу", () -> {
            mainPage.openMainPage();
        });

        step("Выполнить поиск книги 'Анна Каренина'", () -> {
            mainPage.searchFor(bookTitle);
        });

        step("Проверяем результаты поиска", () -> {
            searchResultsPage.verifyBookInResults(bookTitle);
        });
    }
}
