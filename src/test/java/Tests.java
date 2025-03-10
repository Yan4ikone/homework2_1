import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import pages.PageFactoryMainMarket;

import static com.codeborne.selenide.Selenide.open;
import static helpers.Properties.configProperties;

public class Tests {

    /**
     * Класс для выполнения тестов поиска на маркетплейсе с использованием PageFactory.
     * @author Yan
     * @param title - заголовок, используется в {@link pages.PageFactoryMainMarket#phones(String)}
     * @param product - модель, используется в {@link pages.PageFactoryPhoneMarket#choosePhone(String, String)}
     * @param productApple - производитель, используется в
     * {@link pages.PageFactoryPhoneMarket#choosePhone(String, String)}
     */
@Feature("Проверка результатов поиска")
@DisplayName("Проверка результатов поиска с помощью PF")
@ParameterizedTest(name = "{displayName} {arguments}")
@MethodSource("helpers.DataProvider#providerCheckingElements")
    public void mainTest(String title, String product, String productApple) {
    open(configProperties.baseUrl(), PageFactoryMainMarket.class)
            .phones(title)
            .choosePhone(productApple, product);
    }
}
