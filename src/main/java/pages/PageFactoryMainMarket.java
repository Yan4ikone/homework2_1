package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
/**
 * Главная страница маркетплейса с методами для навигации по категориям.
 * @author Yan
 */
public class PageFactoryMainMarket {

    @Step("Проверка заголовка {title}")
    public PageFactoryPhoneMarket phones(String title) {
        $x("//div[@data-zone-name ='catalog']").click();
        actions().moveToElement($x("//li[@data-zone-name='category-link']/a[@href='https://market.yandex.ru/special/electronics_dep']")).perform();
        $x("//a[text()='Смартфоны']").click();
        $x("//h1").shouldHave(text(title));
        return page(PageFactoryPhoneMarket.class);
    }
}
