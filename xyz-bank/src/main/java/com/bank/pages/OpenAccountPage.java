package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    By openAccountBtn = By.xpath("//div[@class='border box padT20 ng-scope']/div/button[2]");
    By selectCustomer = By.xpath("//select[@id='userSelect']");
    By selectCurrency =By.xpath("//select[@id='currency']");
    By processBtn =By.xpath("//button[contains(text(),'Process')]");




    //This method will will select customer name from drop down
    public void clickOnCustomerDropDown(String name,int index) {
        Reporter.log("clicking customer drop down " + selectCustomer + "<br>");
        clickOnElement(selectCustomer);
        selectByIndex(selectCustomer,index);
    }
    //This method will will select currency pound from drop down
    public void clickOnPoundFromDropDown(int index) {
        Reporter.log("clicking Pound currency from drop down " + selectCurrency + "<br>");
        clickOnElement(selectCurrency);
        selectByIndex(selectCurrency,index);
    }
    //This method will click on process btn
    public void clickOnProcessBtn() {
        Reporter.log("clicking on process btn " + processBtn + "<br>");
        clickOnElement(processBtn);

    }


}