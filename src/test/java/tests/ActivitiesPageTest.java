package tests;

import helpers.AcceptCookie;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.ActivitiesPage;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


public class ActivitiesPageTest extends TestBase{

    AcceptCookie acceptCookie = new AcceptCookie();
    ActivitiesPage activitiesPage = new ActivitiesPage();

    @DisplayName("Проверка перехода по баннеру")
    @Tag("activities")
    @Test
    void checkingTransitionByBanner() {
        step("Открыть главную страницу", () -> {
            activitiesPage.openPage();
        });
        step("Принять куки файлы", () -> {
            acceptCookie.acceptCookie();
        });
        step("Перейти на страницу 'Мероприятия'", () -> {
            activitiesPage.goToActivityPage();
        });
        step("Нажать на карточку", () -> {
            activitiesPage.clickByTitleActivityCard("MAGNIT TECH x Infostart Tech Event");
        });
        step("Переключится на открывшуюся карточку", () -> {
            switchTo().window(1);
        });
        step("Проверить, что заголовок содержит правильное навзвание", () -> {
            activitiesPage.checkHeader("MAGNIT TECH x Infostart Tech Event");
        });
        step("Закрыть вкладку и вернуться обратно", () -> {
            closeWindow();
            switchTo().window(0);
        });


    }

    @DisplayName("Проверка работы фильтра по городу мероприятия")
    @Tag("activities")
    @Test
    void checkingUseOfFilterByCity() {
        step("Открыть главную страницу", () -> {
            activitiesPage.openPage();
        });
        step("Принять куки файлы", () -> {
            acceptCookie.acceptCookie();
        });
        step("Перейти на страницу 'Мероприятия'", () -> {
            activitiesPage.goToActivityPage();
        });
        step("Нажать на область фильтра по выбору города", () -> {
            activitiesPage.clickByFilterCity();
        });
        step("Выбрать значение из списка", () -> {
            activitiesPage.chooseValueInFilterCity("Самара");
        });
        step("Нажать на область фильтра по выбору города, чтобы закрыть выпадающее меню", () -> {
            activitiesPage.clickByFilterCity();
        });
        step("Проверить, что первая карточка содержит название выбранного города", () -> {
            activitiesPage.checkLabelCity("Самара");
        });
    }

    @DisplayName("Проверка работы фильтра по типу мероприятия")
    @Tag("activities")
    @Test
    void checkingUseOfFilterByTypeActivities() {
        step("Открыть главную страницу", () -> {
            activitiesPage.openPage();
        });
        step("Принять куки файлы", () -> {
            acceptCookie.acceptCookie();
        });
        step("Перейти на страницу 'Мероприятия'", () -> {
            activitiesPage.goToActivityPage();
        });
        step("Нажать на область фильтра по выбору темы мероприятия", () -> {
            activitiesPage.clickByFilterType();
        });
        step("Выбрать значение из списка", () -> {
            activitiesPage.chooseValueInFilterType("Mobile dev");
        });
        step("Нажать на область фильтра по выбору города, чтобы закрыть выпадающее меню", () -> {
            activitiesPage.clickByFilterType();
        });
        step("Нажать на первую карточку", () -> {
            activitiesPage.clickFirstActivityCard();
        });
        step("Переключится на открывшуюся карточку", () -> {
            switchTo().window(1);
        });
        step("Проверить, что стоит метка с выбранным значением", () -> {
            activitiesPage.checkLabelTypeActivity("Mobile dev");
        });
        step("Закрыть вкладку и вернуться обратно", () -> {
            closeWindow();
            switchTo().window(0);
        });


    }
}
