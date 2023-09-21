package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SectionsPage {

    private SelenideElement
            matdialog = $("#mat-dialog-0"),
            navigations = $(".section-box__navigations"),
            mainHeading = $(".menu-categories__main-heading"),
            boxTitle = $(".universal-catalog-title__text"),
            pageTitle = $(".home-services-page-title"),
            catalogTitle = $(".universal-catalog-title__text");

    public void openPage(String url, String acceptcookie) {
        open(url);
        matdialog.find(byText(acceptcookie)).click();
    }

    public void clickOnTariffs(String tariffs) {
        navigations.find(byText(tariffs)).click();
    }

    public void checkOpenPageTariffs(String tariffs) {
        mainHeading.shouldHave(text(tariffs));
        Selenide.back();
    }

    public void clickOnServices(String services) {
        navigations.find(byText(services)).click();
    }

    public void checkOpenPageServices(String services) {
        boxTitle.shouldHave(text(services));
        Selenide.back();
    }

    public void clickOnHome(String home) {
        navigations.find(byText(home)).click();
    }

    public void checkOpenPageHome(String home) {
        pageTitle.shouldHave(text(home));
        Selenide.back();
        Selenide.back();
    }

    public void clickOnApplications(String applications) {
        navigations.find(byText(applications)).click();
    }

    public void checkOpenPageApplications(String applications) {
        catalogTitle.shouldHave(text(applications));
    }
}