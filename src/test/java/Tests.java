import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.codeborne.selenide.Selenide.open;
import static helpers.Properties.configProperties;


public class Tests {

@Feature("Проверка результатов поиска")
@DisplayName("Проверка результатов поиска с помощью PF")
@ParameterizedTest(name = "{displayName} {arguments}")
@MethodSource("helpers.DataProvider#providerCheckingElements")
    public void mainTest() {
    open(configProperties.baseUrl());



    }
}
