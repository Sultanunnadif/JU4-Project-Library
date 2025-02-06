package com.nadif.stepdefinition;

import com.Base.SDBase;
import com.nadif.Pages.SDHome;
import io.cucumber.java.en.Then;

public class SDhomeStep extends SDBase {
    SDHome homePage;
    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
    homePage = new SDHome(driver);
    homePage.validateElement();
    }
}
