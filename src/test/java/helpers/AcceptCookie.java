package helpers;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AcceptCookie {

    public void acceptCookie() {
        if ($(".cookies-popup").isDisplayed()) {
            $(".cookies-popup").$(byText("Хорошо")).click();
        }
    }
}
