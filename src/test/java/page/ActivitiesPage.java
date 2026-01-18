package page;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.baseUrl;

public class ActivitiesPage {

    private final SelenideElement
            goToActivity = $(".header__content").$(byText("Мероприятия")),
            sectionActivityCard = $("#past-activites"),
            mainHeaderActivity = $("h1"),
            filterByCity = $(".select-multiple.z-index-2"),
            valueFromFilterCity = $(".select-multiple__dropdown-inner"),
            labelCity = $(".activities__cards .activity-vard__venue"),
            filterByTypeActivity = $(".select-multiple.z-index-3"),
            valueFromFilterTypeActivity = $(".select-multiple__dropdown-inner"),
            activityFirstCard = $("#past-activites a:first-child"),
            labelTypeActivity = $(".activity-hero__tag.activity-hero__tag--specialty");


    public void openPage() {
        open(baseUrl);
    }
    public void goToActivityPage(){
        goToActivity.click();
    }
    public void clickByTitleActivityCard(String value) {
        sectionActivityCard.$(byText(value)).click();
    }
    public void checkHeader(String value) {
        mainHeaderActivity.shouldHave(text(value));
    }

    public void clickByFilterCity() {
        filterByCity.click();
    }
    public void chooseValueInFilterCity(String value) {
        valueFromFilterCity.$(byText(value)).click();
    }
    public void checkLabelCity(String value) {
        labelCity.shouldHave(text(value));
    }
    public void clickByFilterType() {
        filterByTypeActivity.click();
    }
    public void chooseValueInFilterType(String value) {
        valueFromFilterTypeActivity.$(byText(value)).click();
    }
    public void clickFirstActivityCard() {
        activityFirstCard.click();
    }
    public void checkLabelTypeActivity(String value) {
        labelTypeActivity.shouldHave(text(value));
    }












}
