package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class LoginPage extends Utility {
    By emailField = By.xpath("//input[@id='Email']");
    By passwordField =By.xpath("//input[@id='Password']");
    By loginBtn =By.xpath("//input[@value='Log in']");
    By welcomeText =By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By errorMessage =By.xpath("//div[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]");
    By signInText =By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public void enterEmailId(String email){
        Reporter.log("enter email"+email+"to email filed"+emailField.toString()+"<br>");
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        Reporter.log("enter password"+password+"to password filed"+passwordField.toString()+"<br>");
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginBtn(){
        Reporter.log("clicking on login button"+loginBtn.toString()+"<br>");
        clickOnElement(loginBtn);
    }
    public String getWelcomeText(){
        Reporter.log("get text to verify"+welcomeText+"<br>");
        return getTextFromElement(welcomeText);

    }
    public String getErrorMessage(){
        Reporter.log("get error message "+errorMessage+"<br>");
        return getTextFromElement(errorMessage);

    }
    public String sigInText(){
        Reporter.log("sign in text "+signInText+"<br>");
        return getTextFromElement(signInText);

    }

}
