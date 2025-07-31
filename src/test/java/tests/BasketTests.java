package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.BasketPage;
import pages.BooksPage;

import static io.qameta.allure.Allure.step;

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
    void searchAndAddSpecificBook() {

        String bookTitle = "Преступление и наказание";

        step("Открываем страницу с книгами", () -> {
            booksPage.openBooksPage()
                    .verifyBooksPage();
        });

        step("Ищем книгу по названию '" + bookTitle + "'", () -> {
            booksPage.searchBook(bookTitle);
        });

        step("Добавляем книгу в корзину", () -> {
            booksPage.addBook(bookTitle);
        });

        step("Открываем корзину и проверяем что книга добавилась", () -> {
            basketPage.openBasketPage()
                    .verifyBook(bookTitle);
        });
    }

    @Test
    @Story("Редактирование заказа")
    @DisplayName("Удаление книги из корзины")
    @Severity(SeverityLevel.NORMAL)
    void removeBookFromBasket() {
        String bookTitle = "Преступление и наказание";

        step("Добавляем книгу в корзину", () -> {
            booksPage.openBooksPage()
                    .searchBook(bookTitle)
                    .addBook(bookTitle);
        });

        step("Открываем корзину", () -> {
            basketPage.openBasketPage();
        });

        step("Удаляем книгу", () -> {
            basketPage.removeBook();
        });

        step("Проверяем, что корзина пуста", () -> {
            basketPage.verifyBasketIsEmpty();
        });
    }
}
