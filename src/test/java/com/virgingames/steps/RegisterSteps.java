package com.virgingames.steps;

import com.virgingames.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterSteps {
    @Given(": I am on homepage")
    public void iAmOnHomepage() {

    }

    @When(": I want to click on {string}button")
    public void iWantToClickOnJoinNowButton(String button) {
        new RegisterPage().clickOnJoinNowButton(button);
    }

    @When(": Click on cookies button")
    public void clickOnCookiesButton() {
        new RegisterPage().clickOnCookies();
    }

    @And(": Accept all cookies")
    public void acceptAllCookies() {
        new RegisterPage().acceptCookies();
    }
}
