package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BooksPage {

    private SelenideElement
            searchInput = $(".catalog__search-form input[name='search']"),
            headerTitle = $(".page-header__title");

    public BooksPage openBooksPage() {
        open("/books/");
        return this;
    }

    public BooksPage verifyBooksPage() {
        headerTitle.shouldHave(text("Книги"));
        return this;
    }

    public BooksPage searchBook(String bookTitle) {
        searchInput.click();
        searchInput.setValue(bookTitle).pressEnter();
        return this;
    }

    public BooksPage addBook(String bookTitle) {
        $$(".book-preview__title")
                .findBy(text(bookTitle))
                .closest(".book-preview")
                .$(".tocart_btn")
                .click();
        return this;
    }
}
