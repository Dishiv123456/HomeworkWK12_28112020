package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    By customersBtn = By.xpath("//div[@class='border box padT20 ng-scope']/div/button[3]");

    By homeBtn = By.xpath("//button[contains(text(),'Home')]");

    By logoutBtn = By.xpath("//button[contains(text(),'Logout')]");
    By getMessage = By.xpath("//label[contains(text(),'Your Name :')]");

    //This method will click on open customers btn
    public void clickOnCustomerBtn() {
        Reporter.log("clicking on customers btn " + customersBtn + "<br>");
        clickOnElement(customersBtn);
    }


    //This method will click on open customers btn
    public void clickOnHomeBtn() {
        Reporter.log("clicking on home btn " + homeBtn + "<br>");
        clickOnElement(homeBtn);

    }


    //This method will verify message
    public String getMessage() {
        Reporter.log("get message  " + getMessage + "<br>");
        return getTextFromElement(getMessage);
    }

    //This method will get text from logout
    public void clickOnLogoutBtn() {
        Reporter.log("clicking on logout btn " + logoutBtn + "<br>");
        clickOnElement(logoutBtn);
    }
//This method to verify logout btn
    public By isLogoutDisplayed() {
        Reporter.log("verification of logout btn " + logoutBtn + "<br>");
        return logoutBtn;
    }


}