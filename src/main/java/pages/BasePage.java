package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public abstract class BasePage {

    public <T extends BasePage> T goLinkByName(String linkName, Class<T> typeNextPage) {
        $$x("")
                .find(text(linkName))
                .click();
        switchTo().window(1);
        return typeNextPage.cast(page(typeNextPage));
    }
}
