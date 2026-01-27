package tests;

import helpers.AcceptCookie;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import page.VacanciesPage;

import static io.qameta.allure.Allure.step;


public class VacanciesPageTest extends TestBase {

    AcceptCookie acceptCookie = new AcceptCookie();
    VacanciesPage vacanciesPage = new VacanciesPage();


    @ValueSource(strings = {
            "разработчик", "Архитектор"
    })
    @DisplayName("Проверка работы поиска по вакансиям")
    @Tag("vacancy")
    @ParameterizedTest(name = "Все найденные вакансии содержат введенное значение {0} ")
    void checkingSearchContainsEnteredValue2(String value) {
        step("Открыть главную страницу", () -> {
            vacanciesPage.openPage();
        });
        step("Принять куки файлы", () -> {
            acceptCookie.acceptCookie();
        });
        step("Перейти на страницу 'Вакансии'", () -> {
            vacanciesPage.goToVacancy();
        });
        step("Ввести значение в поле поиска", () -> {
            vacanciesPage.setValueInInputSearch(value);
        });
        step("Проверить, что результаты поиска содержат введенное значение", () -> {
            vacanciesPage.checkingResults(value);
        });


    }


}
