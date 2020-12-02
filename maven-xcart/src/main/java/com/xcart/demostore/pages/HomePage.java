package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {
    By logInBtn = By.xpath("//*[@id=\"header-bar\"]/div[3]/button/span");
    By createAccountBtn = By.xpath("//tbody/tr[4]/td[1]/a[1]");
    By emailField = By.xpath("//input[@id='login']");
    By passwordField = By.xpath("//input[@id='password']");
    By confirmPasswordField = By.xpath("//input[@id='password-conf']");
    //By createField = By.xpath("//*[@id=\"form-1606761709819\"]/div[3]/div[2]/div/button/span");
    By createField = By.xpath("//body/div[11]/div[2]/form[1]/div[2]/div[2]/div[1]/button[1]");
  //  By hotDealsTab = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]");

    //This method will click on sign in page
    public void clickOnSignInLink() {
        Reporter.log("clicking on sign in link " + logInBtn + "<br>");
        clickOnElement(logInBtn);
    }

    //This method will click on create new account btn
    public void clickToVerifyNewAccountBtnFunctionality() {
        Reporter.log("create new account Btn " + createAccountBtn + "<br>");
        clickOnElement(createAccountBtn);
    }

    //This method will enter Email id to email Field
    public void enterEmailIdToEmailField(String email) {
        Reporter.log("enter email id " + emailField + "<br>");
        sendTextToElement(emailField, email);
    }

    //This method will enter Password to password field
    public void enterPasswordToPasswordField(String password) {
        Reporter.log("enter password " + passwordField + "<br>");
        sendTextToElement(passwordField, password);
    }

    //This method will enter confirm Password to password field
    public void enterConfirmPasswordToPasswordField(String confirmPassword) {
        Reporter.log("enter confirm password " + confirmPasswordField + "<br>");
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    //This method will click on create new account btn
    public void clickOnCreateBtn() {
        Reporter.log("click on create Btn " + createField + "<br>");
      clickOnElement (createField);
    }
}