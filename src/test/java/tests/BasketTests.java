package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BasketPage;
import pages.BooksPage;

@Epic("Работа с корзиной")
@Feature("Управление корзиной")
@Owner("Алина")
@Tag("web")

public class BasketTests extends TestBase {

    BooksPage booksPage = new BooksPage();
    BasketPage basketPage = new BasketPage();

    @Test
    @Story("Формирование заказа")
    @DisplayName("Поиск конкретной книги и добавление в корзину через кнопку 'Купить'")
    @Severity(SeverityLevel.NORMAL)
    void searchAndAddSpecificBookTest() {

        String bookTitle = "Преступление и наказание";

        booksPage.openBooksPage()
                .verifyBooksPage()
                .searchBook(bookTitle)
                .addBook(bookTitle);
        basketPage.openBasketPage()
                .verifyBook(bookTitle);
    }

    @Test
    @Story("Редактирование заказа")
    @DisplayName("Удаление книги из корзины")
    @Severity(SeverityLevel.NORMAL)
    void removeBookFromBasketTest() {

        String bookTitle = "Преступление и наказание";

        booksPage.openBooksPage()
                .searchBook(bookTitle)
                .addBook(bookTitle);
        basketPage.openBasketPage()
                .removeBook()
                .verifyBasketIsEmpty();
    }
}
