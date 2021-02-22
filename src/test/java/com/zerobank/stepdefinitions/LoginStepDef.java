package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @Given("the user login true credential")
    public void the_user_login_true_credential() {



        Assert.assertTrue("Login with successful",new LoginPage().login());
    }

}
