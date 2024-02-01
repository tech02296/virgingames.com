package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//label[@class='dialog_button secondary']")
    WebElement cookiesTab;
    @CacheLookup
    @FindBy(linkText = "Login")
    WebElement loginButton;

    @CacheLookup
    @FindBy(linkText = "Join Now")
    WebElement joinNowButton;

    @CacheLookup
    @FindBy(xpath = "//*[@id='dialog_accept_all']")
    WebElement acceptAll;

    public void clickOnCookies(){
        log.info("clickOnCookiesButton" + cookiesTab.toString());
        clickOnElement(cookiesTab);
    }


    public void clickOnJoinNowButton(String button){
        log.info("clickOnJoinNow" + joinNowButton.toString());
        clickOnElement(joinNowButton);

    }

    public void acceptCookies(){
        log.info("acceptAllCookies" + acceptAll.toString());
        clickOnElement(acceptAll);
    }



}
