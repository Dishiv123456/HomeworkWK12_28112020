package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyUserShouldNotLoginSuccessfullyWithInvalidCredentials() throws InterruptedException {
        homePage.clickOnLoginLink();
        waitFor(1);
        loginPage.enterEmailId("vpatel1236@gmail.com");
        loginPage.enterPassword("456321");
waitFor(1);
        loginPage.clickOnLoginBtn();
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
       waitFor(1);
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void VerifyUserShouldLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnRegisterLink();
        waitFor(1);
        registerPage.selectRadioBtn();
        waitFor(1);
        registerPage.enterFirstName("Ram");
        waitFor(1);
        registerPage.enterLastName("Krishna");
        waitFor(1);
        registerPage.selectDayFromDateOfBirthDropDown("10");
        waitFor(1);
        registerPage.selectMonthFromDateOfBirthDropDown("May");
        waitFor(1);
        registerPage.selectYearFromDateOfBirthDropDown("1985");
        waitFor(1);
        int num = getRandomNumeric();
        String email123 = registerPage.enterEmailId("ramkrishna" + num + "@gmail.com");
        waitFor(1);
        registerPage.enterCompanyName("Prime4");
        waitFor(1);
        registerPage.enterPassword("123456");
        waitFor(1);
        registerPage.enterConfirmPassword("123456");
        waitFor(1);
        registerPage.clickOnRegisterButton();
        waitFor(1);
        registerPage.logOut();
        waitFor(1);
        homePage.clickOnLoginLink();
        waitFor(1);
        loginPage.enterEmailId(email123);
        waitFor(1);
        loginPage.enterPassword("123456");
        waitFor(1);
        loginPage.clickOnLoginBtn();
        String expectedMessage = "Welcome to our store";
        waitFor(1);
        String actualMessage = loginPage.sigInText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }


}
