package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    By addCustomerLink = By.xpath("//div[@class='border box padT20 ng-scope']/div/button[1]");
    By openAccountBtn = By.xpath("//div[@class='border box padT20 ng-scope']/div/button[2]");


    //This method will click on add customer link
    public void clickOnAddCustomerLink() {
        Reporter.log("clicking on add customer link " + addCustomerLink + "<br>");
        clickOnElement(addCustomerLink);
    }
    //This method will click on open account btn
    public void clickOnOpenAccountBtn() {
        Reporter.log("clicking on open account btn " + openAccountBtn + "<br>");
        clickOnElement(openAccountBtn);

    }


}
