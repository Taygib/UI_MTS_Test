package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SectionOurServicesPage {
    private SelenideElement
            matdialog = $("#mat-dialog-0"),
            iconicLinks = $(".our-products-helps__iconic-links"),
            frameTitle = $(".news-page-frame__title"),
            pageTitle = $("#offices-page-title"),
            boxTitle = $(".section-box__title"),
            catalogTitle = $(".universal-catalog-title__text"),
            cardsWrapper = $(".our-products-helps__cards-wrapper"),
            homePageTitle = $(".home-services-page-title"),
            mainHeading = $(".menu-categories__main-heading"),
            bestseller = $(".popular-services-bestseller");

    public void openPage(String url,String acceptcookie) {
        open(url);
        matdialog.find(byText(acceptcookie)).click();
    }

    public void findAndClickRoamingIntercity(String roaming) {
        iconicLinks.find(byText(roaming)).hover();
        iconicLinks.find(byText(roaming)).click();
    }

    public void checkClickRoamingIntercity(String traveling) {
        frameTitle.shouldHave(text(traveling));
        Selenide.back();
    }

    public void findAndClickShopMap(String map) {
        iconicLinks.find(byText(map)).hover();
        iconicLinks.find(byText(map)).click();
    }

    public void checkClickShopMap(String map) {
        pageTitle.shouldHave(text(map));
        Selenide.back();
    }

    public void findAndClickOurTech(String tech) {
        iconicLinks.find(byText(tech)).hover();
        iconicLinks.find(byText(tech)).click();
    }

    public void checkClickOurTech(String tech) {
        boxTitle.shouldHave(text(tech));
        Selenide.back();
        Selenide.back();
    }

    public void findAndClickDiscounts(String discounts) {
        iconicLinks.find(byText(discounts)).hover();
        iconicLinks.find(byText(discounts)).click();
    }

    public void checkClickDiscounts(String discounts) {
        catalogTitle.shouldHave(text(discounts));
        Selenide.back();
    }

    public void findAndClickOnCardMobile(String mobile) {
        cardsWrapper.find(byText(mobile)).hover();
        cardsWrapper.find(byText(mobile)).click();
    }

    public void checkClickOnCardMobile(String mobile) {
        mainHeading.shouldHave(text(mobile));
        Selenide.back();
    }

    public void findAndClickOnCardHomeInet(String home) {
        cardsWrapper.find(byText(home)).hover();
        cardsWrapper.find(byText(home)).click();
    }

    public void checkClickOnCardHomeInet(String home) {
        homePageTitle.shouldHave(text(home));
        Selenide.back();
        Selenide.back();
    }

    public void findAndClickOnCardTV(String tv) {
        cardsWrapper.find(byText(tv)).hover();
        cardsWrapper.find(byText(tv)).click();
    }

    public void checkClickOnCardTV(String tv) {
        bestseller.shouldHave(text(tv));
        Selenide.back();
        Selenide.back();
    }
}