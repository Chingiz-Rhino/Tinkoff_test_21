package tests;

import base.RemoteTestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DebitCardPage;

import static com.codeborne.selenide.logevents.SelenideLogger.step;
@Tag("Debit")
public class DebitCards extends RemoteTestBase {
    DebitCardPage debitCardPage = new DebitCardPage();


    @Test
    @DisplayName("Checking all debit cards page")
    void allDebitCardPageTest() {
        step("Open main page", () -> {
            debitCardPage
                    .openWebSite();
        });
        step("Choose debit cards", () -> {
            debitCardPage
                    .goToAllDebitCardPage();
        });
        step("Check result", () -> {
            debitCardPage
                    .checkResultOfAllDebitCardPageTap();
        });
    }

    @Test
    @DisplayName("Checking premium Debit cards page")
    void premiumDebitCardsPageTest() {
        step("Open main page", () -> {
            debitCardPage
                    .openWebSite();
        });
        step("Choose debit cards", () -> {
            debitCardPage
                    .goToAllDebitCardPage();
        });
        step("Choose premium", () -> {
            debitCardPage
                    .goToPremiumDebitCardPage();
        });
        step("Check Result", () -> {
            debitCardPage
                    .checkResultOfPremiumDebitCardPageTap();
        });
    }

    @Test
    @DisplayName("Checking traveler Debit cards page")
    void travelerDebitCardsPageTest() {
        step("Open main page", () -> {
            debitCardPage
                    .openWebSite();
        });
        step("Choose debit cards", () -> {
            debitCardPage
                    .goToAllDebitCardPage();
        });
        step("Choose traveler", () -> {
            debitCardPage
                    .goToTravelerDebitCardPage();
        });
        step("Check Result", () -> {
            debitCardPage
                    .checkResultOfTravelerDebitCardPageTap();
        });
    }

    @Test
    @DisplayName("Checking motorist Debit cards page")
    void motoristDebitCardsPageTest() {
        step("Open main page", () -> {
            debitCardPage
                    .openWebSite();
        });
        step("Choose debit cards", () -> {
            debitCardPage
                    .goToAllDebitCardPage();
        });
        step("Choose motorist", () -> {
            debitCardPage
                    .goToMotoristDebitCardPage();
        });
        step("Check Result", () -> {
            debitCardPage
                    .checkResultOfMotoristDebitCardPageTap();
        });
    }

    @Test
    @DisplayName("Checking gamer Debit cards page")
    void gamerDebitCardsPageTest() {
        step("Open main page", () -> {
            debitCardPage
                    .openWebSite();
        });
        step("Choose debit cards", () -> {
            debitCardPage
                    .goToAllDebitCardPage();
        });
        step("Choose gamer", () -> {
            debitCardPage
                    .goToGamerDebitCardPage();
        });
        step("Check Result", () -> {
            debitCardPage
                    .checkResultOfGamerDebitCardPageTap();
        });
    }

    @Test
    @DisplayName("Checking purchases Debit cards page")
    void purchasesDebitCardsPageTest() {
        step("Open main page", () -> {
            debitCardPage
                    .openWebSite();
        });
        step("Choose debit cards", () -> {
            debitCardPage
                    .goToAllDebitCardPage();
        });
        step("Choose purchases", () -> {
            debitCardPage
                    .goToPurchasesDebitCardPage();
        });
        step("Check Result", () -> {
            debitCardPage
                    .checkResultOfPurchasesDebitCardPageTap();
        });
    }
}
