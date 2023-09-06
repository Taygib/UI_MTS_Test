package testMTS;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MenuInHeaderPage;

import static io.qameta.allure.Allure.step;

public class MenuInHeaderTest extends TestBase{
    MenuInHeaderPage menuInHeader = new MenuInHeaderPage();

    @Test
    @Tag("MTS")
    @Tag("MenuInHeader")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка меню в хедере")
    void checkMenuInHeader() {

        step("Открыть страницу и принять cookies", () -> {
            menuInHeader.openPage("/personal","Принять");
        });

        step("Проверка наличии меню =Мобильная связь=", () -> {
            menuInHeader.findMobileConnection("Мобильная связь");
        });

        step("Проверка наличии меню =Для дома=", () -> {
            menuInHeader.findForHome("Для дома");
        });

        step("Проверка наличии меню =Сервисы и подписки=", () -> {
            menuInHeader.findServicesAndSubs("Сервисы и подписки");
        });

        step("Проверка наличии меню =Финансы=", () -> {
            menuInHeader.findFinance("Финансы");
        });

        step("Проверка наличии меню =Интернет-магазин=", () -> {
            menuInHeader.findOnlineStore("Интернет-магазин");
        });
    }
}