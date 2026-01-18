package tests;

import helpers.AcceptCookie;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.MediaPage;

import static io.qameta.allure.Allure.step;

public class MediaPageTest extends TestBase {

    AcceptCookie acceptCookie = new AcceptCookie();
    MediaPage mediaPage = new MediaPage();


    @DisplayName("Проверка, что при клике на таб есть медиа карточки")
    @Tag("media")
    @Test
    void testSwitchTabs2() {
        step("Открыть главную страницу", () -> {
            mediaPage.openPage();
        });
        step("Принять куки файлы", () -> {
            acceptCookie.acceptCookie();
        });
        step("Перейти на страницу 'Медиа'", () -> {
            mediaPage.goToMedia();
        });
        step("Нажать на вкладку 'Почитать'", () -> {
            mediaPage.clickMediaTab("Почитать");
        });
        step("Проверить, что карточки на странице есть", () -> {
            mediaPage.checkingExistCards();
        });






    }


}
