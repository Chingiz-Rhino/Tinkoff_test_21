package quru.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DebitCardPage {
    SelenideElement
            // All Debit Card Page
            allDebitCardPageTap = $(".dbIWyAi99"),
            allDebitCardPageResult = $(".abHK--A7Jz"),
    // Premium Debit Card Page
    premiumDebitCardPageTap = $(byText("Премиальные")),
            premiumDebitCardPageResult = $(".abHK--A7Jz"),

    // Traveler Debit Card Page
    travelerDebitCardPageTap = $(byText("Путешественнику")),
            travelerDebitCardPageResult = $(".abHK--A7Jz"),

    // Motorist Debit Card Page
    motoristDebitCardPageTap = $(byText("Автомобилисту")),
            motoristDebitCardPageResult = $(".abHK--A7Jz"),
    // Gamer Debit Card Page
    gamerDebitCardPageTap = $(byText("Геймеру")),
            gamerDebitCardPageResult = $(".abHK--A7Jz"),

    // Purchases Debit Card Page
    purchasesDebitCardPageTap = $(byText("Покупки")),
            purchasesDebitCardPageResult = $(".abHK--A7Jz");

    public DebitCardPage openWebSite() {
        open("https://www.tinkoff.ru/");

        return this;
    }

    // All Debit Card Page
    public DebitCardPage goToAllDebitCardPage() {
        allDebitCardPageTap.click();

        return this;
    }

    public DebitCardPage checkResultOfAllDebitCardPageTap() {
        allDebitCardPageResult.shouldHave(text("Дебетовые карты"));

        return this;
    }

    // Premium Debit Card Page
    public DebitCardPage goToPremiumDebitCardPage() {
        premiumDebitCardPageTap.click();

        return this;
    }

    public DebitCardPage checkResultOfPremiumDebitCardPageTap() {
        premiumDebitCardPageResult.shouldHave(text("Премиальные дебетовые карты"));
        return this;
    }

    // Traveler Debit Card Page

    public DebitCardPage goToTravelerDebitCardPage() {
        travelerDebitCardPageTap.click();

        return this;
    }

    public DebitCardPage checkResultOfTravelerDebitCardPageTap() {
        travelerDebitCardPageResult.shouldHave(text("Дебетовые карты для путешествий"));
        return this;
    }

    // Motorist Debit Card Page

    public DebitCardPage goToMotoristDebitCardPage() {
        motoristDebitCardPageTap.click();

        return this;
    }

    public DebitCardPage checkResultOfMotoristDebitCardPageTap() {
        motoristDebitCardPageResult.shouldHave(text("Дебетовые карты для водителей"));
        return this;
    }

    // Gamer Debit Card Page

    public DebitCardPage goToGamerDebitCardPage() {
        gamerDebitCardPageTap.click();

        return this;
    }

    public DebitCardPage checkResultOfGamerDebitCardPageTap() {
        gamerDebitCardPageResult.shouldHave(text("Дебетовые карты для геймеров"));
        return this;
    }

    // Purchases Debit Card Page

    public DebitCardPage goToPurchasesDebitCardPage() {
        purchasesDebitCardPageTap.click();

        return this;
    }

    public DebitCardPage checkResultOfPurchasesDebitCardPageTap() {
        purchasesDebitCardPageResult.shouldHave(text("Дебетовые карты для покупок"));
        return this;
    }

}
