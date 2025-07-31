package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class BasketPage {

    private SelenideElement
            removeButton = $(".cart__item-delete"),
            emptyBasketMessage = $(".cart");

    public BasketPage openBasketPage() {
        open("/profile/basket/");
        return this;
    }

    public BasketPage verifyBook(String bookTitle) {
        $$(".cart_td.cart_cell.cart_cell_name")
                .findBy(text(bookTitle));
        return this;
    }

    public BasketPage removeBook() {
        removeButton.click();
        return this;
    }

    public void verifyBasketIsEmpty() {
        emptyBasketMessage.shouldHave(text("В корзине нет товаров"));
    }
}
