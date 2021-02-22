package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(id="signin_button")
    public WebElement signButton;
    @FindBy(id="user_login")
    public WebElement userNameBox;
    @FindBy(id="user_password")
    public WebElement userPasswordBox;
    @FindBy(name="submit")
    public WebElement submitButton;

    public boolean login(){

        Driver.get().get(ConfigurationReader.get("url"));

        signButton.click();
        userNameBox.sendKeys(ConfigurationReader.get("userName"));
        userPasswordBox.sendKeys(ConfigurationReader.get("password"));
        submitButton.click();

        return Driver.get().getTitle().equals("Zero - Account Summary");

    }


}
