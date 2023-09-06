package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ContactsPage {
    private SelenideElement
            matdialog = $("#mat-dialog-0"),
            itemVK = $(".footer__social-item_vk"),
            pageName = $(".page_name"),
            itemOK = $(".footer__social-item_ok"),
            groupName = $(".group-name_h");

    public void openPage(String url, String acceptcookie) {
        open(url);
        matdialog.find(byText(acceptcookie)).click();
    }

    public void checkPageVK(String vkMTS) {
        itemVK.click();
        pageName.shouldHave(text(vkMTS));
    }

    public void checkPageOK(String okMTS) {
        itemOK.click();
        groupName.shouldHave(text(okMTS));
    }
}