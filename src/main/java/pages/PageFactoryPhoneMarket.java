package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helpers.Assertions;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница с фильтрацией смартфонов по параметрам поиска.
 * @author Yan
 */
public class PageFactoryPhoneMarket {

    public void choosePhone(String productApple, String product) {
        $x("//span[contains(text(), 'Показать всё')]").click(); // нажатие вкладки показать всё
        SelenideElement searchFieldEnter = $x("//*[@placeholder='Найти']");
        searchFieldEnter.setValue(productApple); // ввод фирмы Apple в поисковую строку
        SelenideElement phoneApple = $x("//span[text()='Apple']");
        phoneApple.click();// нажатие кнопки Apple
        SelenideElement buttonNext = $x("//span[text()='Вперёд']");
        ElementsCollection titles = $$x("//span[@data-auto='snippet-title' and not(ancestor::*[@data-auto='searchIncut'])]");
        if (buttonNext.is(exist)) {
            do {
                buttonNext.scrollIntoView(false);
            } while (buttonNext.is(visible));
        }
        for (SelenideElement item : titles) {
            System.out.println(item.text());
            System.out.println(product);
            Assertions.assertTrue(item.text().toLowerCase().contains(product),
                    "Элементы не соответствуют заданным параметрам");
        }
    }
}
