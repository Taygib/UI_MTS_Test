package testMTS;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ContactsPage;

import static io.qameta.allure.Allure.step;

public class ContactsTest extends TestBase {
    ContactsPage contacts = new ContactsPage();

    @Test
    @Tag("MTS")
    @Tag("VK")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка перехода на страницу ВК")
    void openVK() {

        step("Открыть страницу и принять cookies", () -> {
            contacts.openPage("/personal", "Принять");
        });

        step("Проверка страницы ВК", () -> {
            contacts.checkPageVK("МТС");
        });
    }

    @Test
    @Tag("MTS")
    @Tag("OK")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка перехода на страницу Одноклассники")
    void openOK() {

        step("Открыть страницу и принять cookies", () -> {
            contacts.openPage("/personal", "Принять");
        });

        step("Проверка страницы ОК", () -> {
            contacts.checkPageOK("МТС");
        });
    }
}