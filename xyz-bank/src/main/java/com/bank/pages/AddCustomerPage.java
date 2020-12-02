package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    By firstNameField = By.xpath("//form[@name='myForm']/div[1]/input[1]");
    By lastNameField = By.xpath("//form[@name='myForm']/div[2]/input[1]");
    By postCodeField = By.xpath("//form[@name='myForm']/div[3]/input[1]");
    By addCustomerBtn = By.xpath("//form[@name='myForm']//button");
    //This method will enter first name
    public void enterFirstName(String name) {
        Reporter.log("Enter First Name " + firstNameField + "<br>");
        sendTextToElement(firstNameField, name);
    }

    //This method will enter last name
    public void enterLastName(String lastName) {
        Reporter.log("Enter Last Name " + lastNameField + "<br>");
        sendTextToElement(lastNameField, lastName);
    }

    //This method will enter post code
    public void enterPostCode(String postCode) {
        Reporter.log("Enter Post Code " + postCodeField + "<br>");
        sendTextToElement(postCodeField, postCode);
    }

    //This method will enter post code
    public void clickToAddCutomerBtn() {
        Reporter.log("clicking on add cutomer btn " + addCustomerBtn + "<br>");
        clickOnElement(addCustomerBtn);
    }
}
