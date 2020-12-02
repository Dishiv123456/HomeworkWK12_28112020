package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    By selectCustomer = By.xpath("//select[@id='userSelect']");
    By loginBtn = By.xpath("//button[contains(text(),'Login')]");


    //This method will will select customer name from drop down
    public void clickOnCustomerDropDown(String name, int index) {
        Reporter.log("clicking customer drop down " + selectCustomer + "<br>");
        clickOnElement(selectCustomer);
        selectByIndex(selectCustomer, index);
    }

    //This method will click on log in btn
    public void clickOnLoginBtn() {
        Reporter.log("clicking on login btn " + loginBtn + "<br>");
        clickOnElement(loginBtn);
    }
}
