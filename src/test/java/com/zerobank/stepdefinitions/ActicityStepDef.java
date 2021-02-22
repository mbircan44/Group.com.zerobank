package com.zerobank.stepdefinitions;

import com.zerobank.pages.ActivityPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ActicityStepDef {

    @When("the user clicks activity page")
    public void theUserClicksActivityPage() {
        new ActivityPage().gotoActivityPage();
    }

    @Then("the user should be able to see transection")
    public void theUserShouldBeAbleToSeeTransection() {

        Assert.assertEquals("Zero - Account Activity", Driver.get().getTitle());
    }
}
