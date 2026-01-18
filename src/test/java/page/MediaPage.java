package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MediaPage {

    private final SelenideElement
            goToMedia = $(".header__content").$(byText("Медиа"));


     ElementsCollection
             mediaTabs = $$(".media-tab"),
             sectionMediaCards = $$(".media-card");

     public void openPage() {
         open(baseUrl);
     }

    public void goToMedia() {
        goToMedia.click();
    }

    public void clickMediaTab(String value) {
        mediaTabs.findBy(text(value)).click();
    }

    public void checkingExistCards() {
        sectionMediaCards.shouldHave(sizeGreaterThan(0));
    }

}
