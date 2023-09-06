package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MenuInHeaderPage {
    private SelenideElement
            matdialog = $("#mat-dialog-0"),
            navigationList = $(".main-menu-navigation__list");

    public void openPage(String url, String acceptcookie) {
        open(url);
        matdialog.find(byText(acceptcookie)).click();
    }

    public void findMobileConnection(String mobileConnection) {
        navigationList.shouldHave(text(mobileConnection));
        navigationList.find(byText(mobileConnection)).hover();
    }

    public void findForHome(String forHome) {
        navigationList.shouldHave(text(forHome));
        navigationList.find(byText(forHome)).hover();
    }

    public void findServicesAndSubs(String servicesAndSubs) {
        navigationList.shouldHave(text(servicesAndSubs));
        navigationList.find(byText(servicesAndSubs)).hover();
    }

    public void findFinance(String finance) {
        navigationList.shouldHave(text(finance));
        navigationList.find(byText(finance)).hover();
    }

    public void findOnlineStore(String onlineStore) {
        navigationList.shouldHave(text(onlineStore));
        navigationList.find(byText(onlineStore)).hover();
    }
}