package testMTS;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SectionOurServicesPage;

import static io.qameta.allure.Allure.step;


public class SectionOurServicesTest extends TestBase {
    SectionOurServicesPage ourServices = new SectionOurServicesPage();

    @Test
    @Tag("MTS")
    @Tag("Services")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка кликабельности сервисов в разделе НАШИ СЕРВИСЫ ДЛЯ ДОМА И ЖИЗНИ")
    void checkOurServices() {

        step("Открыть страницу и принять cookies", () -> {
            ourServices.openPage("/personal","Принять");
        });

        step("Проверка кликабельности  =Роуминг и межгород=", () -> {
            ourServices.findAndClickRoamingIntercity("Роуминг и межгород");
            ourServices.checkClickRoamingIntercity("Поездки по России");
        });

        step("Проверка кликабельности  =Карта магазинов=", () -> {
            ourServices.findAndClickShopMap("Карта магазинов");
            ourServices.checkClickShopMap("Карта магазинов МТС");
        });

        step("Проверка кликабельности  =Наши технологии=", () -> {
            ourServices.findAndClickOurTech("Наши технологии");
            ourServices.checkClickOurTech("Технологии SMARTСЕТИ");
        });

        step("Проверка кликабельности  =Акции и скидки=", () -> {
            ourServices.findAndClickDiscounts("Акции и скидки");
            ourServices.checkClickDiscounts("Актуальные акции");
        });

        step("Проверка кликабельности по карточке  =МОБИЛЬНАЯ СВЯЗЬ=", () -> {
            ourServices.findAndClickOnCardMobile("МОБИЛЬНАЯ");
            ourServices.checkClickOnCardMobile("Тарифы и подписки");
        });

        step("Проверка кликабельности по карточке  =ДОМАШНИЙ ИНТЕРНЕТ И ТВ=", () -> {
            ourServices.findAndClickOnCardHomeInet("ДОМАШНИЙ");
            ourServices.checkClickOnCardHomeInet("Пакеты услуг интернет + ТВ от МТС");
        });

        step("Проверка кликабельности по карточке  =СПУТНИКОВОЕ ТВ=", () -> {
            ourServices.findAndClickOnCardTV("СПУТНИКОВОЕ");
            ourServices.checkClickOnCardTV("ТВ");
        });
    }
}