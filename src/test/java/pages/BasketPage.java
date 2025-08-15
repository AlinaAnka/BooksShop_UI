package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BasketPage {

    private SelenideElement
            removeButton = $(".cart__item-delete"),
            emptyBasketMessage = $(".cart");

    @Step("Открыть страницу корзины")
    public BasketPage openBasketPage() {
        open("/profile/basket/");
        return this;
    }

    @Step("Проверить наличие книги '{bookTitle}' в корзине")
    public BasketPage verifyBook(String bookTitle) {
        $$(".cart_td.cart_cell.cart_cell_name")
                .findBy(text(bookTitle));
        return this;
    }

    @Step("Удалить книгу из корзины")
    public BasketPage removeBook() {
        removeButton.click();
        return this;
    }

    @Step("Проверить, что корзина пуста")
    public void verifyBasketIsEmpty() {
        emptyBasketMessage.shouldHave(text("В корзине нет товаров"));
    }
}
