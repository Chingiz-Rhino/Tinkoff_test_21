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
            allDebitCardPageResult = $(".abFiMO59W"),
    // Premium Debit Card Page
    premiumDebitCardPageTap = $(byText("Премиальные")),
            premiumDebitCardPageResult = $(".abFiMO59W"),

    // Traveler Debit Card Page
    travelerDebitCardPageTap = $(byText("Путешественнику")),
            travelerDebitCardPageResult = $(".abFiMO59W"),

    // Motorist Debit Card Page
    motoristDebitCardPageTap = $(byText("Автомобилисту")),
            motoristDebitCardPageResult = $(".abFiMO59W"),
    // Gamer Debit Card Page
    gamerDebitCardPageTap = $(byText("Геймеру")),
            gamerDebitCardPageResult = $(".abFiMO59W"),

    // Purchases Debit Card Page
    purchasesDebitCardPageTap = $(byText("Покупки")),
            purchasesDebitCardPageResult = $(".abFiMO59W");

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
