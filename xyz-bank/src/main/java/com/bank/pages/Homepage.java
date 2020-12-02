package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class Homepage extends Utility {

    By customerLoginLink = By.xpath("//button[contains(text(),'Customer Login')]");
    By bankManagerLoginLink = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    //This method will click to customer login link
    public void clickOnCustomerLoginLink() {
        Reporter.log("clicking on customer login link " + customerLoginLink + "<br>");
        clickOnElement(customerLoginLink);
    }

    //This method will click to bank manager login link
    public void clickOnManagerLoginLink() {
        Reporter.log("clicking on bank manager login link " + bankManagerLoginLink + "<br>");
        clickOnElement(bankManagerLoginLink);
    }

}
