package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//h1[contains(text(),'Register')]");
    By genderRadioBtn = By.xpath("//span[@class='male']");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dateOfBirthDayField = By.xpath("//form[1]//select[1]");
    By dateOfBirthMonthField = By.xpath("//form[1]//select[2]");
    By dateOfBirthYearField = By.xpath("//form[1]//select[3]");
    By emailField = By.id("Email");
    By companyNameField = By.xpath("//input[@id='Company']");
    By newsLetterBtn = By.xpath("//label[contains(text(),'Newsletter:')]");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");
    By registrationSuccessfully =By.xpath("//div[contains(text(),'Your registration completed')]");
    By logOut= By.className("ico-logout");

    // This method will get text from register link
    public String VerifyUserNavigateToRegisterPageSuccessfully() {
        Reporter.log("Landing on register page" + registerText.toString() + "<br>");
        return getTextFromElement(registerText);
    }

    //This method will select Gender Button
    public void selectRadioBtn() {
        Reporter.log("selected radio button" + genderRadioBtn.toString() + "<br>");
        clickOnElement(genderRadioBtn);
    }

    //This method will enter first name on first name field
    public void enterFirstName(String firstName) {
        Reporter.log("Entered first name" + firstNameField.toString() + "<br>");
        sendTextToElement(firstNameField, firstName);
    }

    //This method will enter last name on last name field
    public void enterLastName(String lastName) {
        Reporter.log("Entered last name" + lastNameField.toString() + "<br>");
        sendTextToElement(lastNameField, lastName);
    }

    //This method will select day from day drop down
    public void selectDayFromDateOfBirthDropDown(String day) {
        Reporter.log("selected day" + dateOfBirthDayField.toString() + "<br>");
       sendTextToElement(dateOfBirthDayField, day);
    }

    //This method will select month from month drop down
    public void selectMonthFromDateOfBirthDropDown(String month) {
        Reporter.log("selected month" + dateOfBirthMonthField.toString() + "<br>");
       sendTextToElement(dateOfBirthMonthField, month);
    }

    //This method will select day from day drop down
    public void selectYearFromDateOfBirthDropDown(String year) {
        Reporter.log("selected year" + dateOfBirthYearField.toString() + "<br>");
        sendTextToElement(dateOfBirthYearField, year);
    }

    //this method will enter email Id on email Id field
    public String enterEmailId(String email) {
        Reporter.log("Entered email Id" + emailField.toString() + "<br>");
        sendTextToElement(emailField, email);
        return email;
    }

    //This method will enter company name to company name filed
    public void enterCompanyName(String companyName) {
        Reporter.log("Entered company name " + companyNameField.toString() + "<br>");
        sendTextToElement(companyNameField, companyName);
    }

    //This method will tick newsletter button
    public void clickOnNewsLetterBtn() {
        Reporter.log("click on newsletter button" + newsLetterBtn.toString() + "<br>");
        clickOnElement(newsLetterBtn);
    }

    //This method will enter password in password field
    public void enterPassword(String password) {
        Reporter.log("entered password" + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);

    }

    //This method will enter password in password field
    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log("entered confirm  password" + confirmPasswordField.toString() + "<br>");
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    //This method will click on register button
    public void clickOnRegisterButton() {
        Reporter.log("click on register button" + registerBtn.toString() + "<br>");
        clickOnElement(registerBtn);
    }

    //This method we return get message that registration successfully
    public String getRegistrationSuccessfullyMessage(){
        Reporter.log("get text register button" + registrationSuccessfully+ "<br>");
        return   getTextFromElement(registrationSuccessfully);
    }

    //This method will click on log out btn
    public void logOut(){
        Reporter.log("click on logout button" + logOut + "<br>");
        clickOnElement(logOut);
    }

}




