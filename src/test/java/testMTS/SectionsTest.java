package testMTS;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SectionsPage;

import static io.qameta.allure.Allure.step;

public class SectionsTest extends TestBase{
    SectionsPage sections = new SectionsPage();

    @Test
    @Tag("MTS")
    @Tag("Sections")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка кликабельности разделов")
    void sections() {

        step("Открыть страницу и принять cookies", () -> {
            sections.openPage("/personal","Принять");
        });

        step("Открыть раздел =Тарифы и подписки=", () -> {
            sections.clickOnTariffs("Тарифы");
        });

        step("Проверка открытого раздела =Тарифы и подписки=", () -> {
            sections.checkOpenPageTariffs("Тарифы и подписки");
        });

        step("Открыть раздел =Услуги и опции=", () -> {
            sections.clickOnServices("Услуги");
        });

        step("Проверка открытого раздела =Услуги и опции=", () -> {
            sections.checkOpenPageServices("Услуги мобильной связи");
        });

        step("Открыть раздел =Домашний интернет и ТВ=", () -> {
            sections.clickOnHome("Домашний");
        });

        step("Проверка открытого раздела =Домашний интернет и ТВ=", () -> {
            sections.checkOpenPageHome("Пакеты услуг интернет + ТВ от МТС");
        });

        step("Открыть раздел =Сервисы и развлечения=", () -> {
            sections.clickOnApplications("Сервисы");
        });

        step("Проверка открытого раздела =Сервисы и развлечения=", () -> {
            sections.checkOpenPageApplications("Сервисы и приложения");
        });
    }
}