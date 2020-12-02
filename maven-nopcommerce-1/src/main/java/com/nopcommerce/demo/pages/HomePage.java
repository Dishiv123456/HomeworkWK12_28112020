package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log in");

    /*
     * This method will click on login link
     * */
    public void clickOnLoginLink() {
        Reporter.log("Clicking on login link" + loginLink.toString() + "<br>");
        clickOnElement(loginLink);

    }

    /*
     * This method will click on register link
     * */
    public void clickOnRegisterLink() {
        Reporter.log("Clicking on register link" + registerLink + "<br>");
        clickOnElement(registerLink);
    }



}
