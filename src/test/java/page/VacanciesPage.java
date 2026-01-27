package page;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class VacanciesPage {

    private final SelenideElement
            goToVacancy = $(".header__content").$(byText("Вакансии")),
            inputSearch = $("input[name='search']");


    ElementsCollection
            sectionVacancyCards = $$(".vacancies__card");

    public void openPage() {
        open(baseUrl);
    }

    public void goToVacancy() {
        goToVacancy.click();
    }

    public void setValueInInputSearch(String value) {
        inputSearch.setValue(value);
    }

    public void checkingResults(String value) {
        sectionVacancyCards.shouldHave(CollectionCondition.allMatch(
                "Все карточки содержат '{value}'",
                element -> element.getText().contains(value)
        ));
    }
}
