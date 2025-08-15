package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BooksPage {

    private SelenideElement
            searchInput = $(".catalog__search-form input[name='search']"),
            headerTitle = $(".page-header__title");

    @Step("Открыть страницу с книгами")
    public BooksPage openBooksPage() {
        open("/books/");
        return this;
    }

    @Step("Проверить, что открыта страница с книгами")
    public BooksPage verifyBooksPage() {
        headerTitle.shouldHave(text("Книги"));
        return this;
    }

    @Step("Искать книгу '{bookTitle}'")
    public BooksPage searchBook(String bookTitle) {
        searchInput.click();
        searchInput.setValue(bookTitle).pressEnter();
        return this;
    }

    @Step("Добавить книгу '{bookTitle}' в корзину")
    public BooksPage addBook(String bookTitle) {
        $$(".book-preview__title")
                .findBy(text(bookTitle))
                .closest(".book-preview")
                .$(".tocart_btn")
                .click();
        return this;
    }
}
