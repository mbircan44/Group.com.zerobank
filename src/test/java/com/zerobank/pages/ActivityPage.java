package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityPage {

    public ActivityPage() {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(id="account_activity_tab")
    public WebElement activityTab;

    public void gotoActivityPage(){
        activityTab.click();


    }
}
