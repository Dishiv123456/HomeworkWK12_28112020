package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyUserShouldNavigateToRegisterSuccessfully() throws InterruptedException {
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
        registerPage.enterEmailId("ramkrishna" + num + "@gmail.com");
        waitFor(1);
        registerPage.enterCompanyName("Prime4");
        waitFor(1);
        registerPage.enterPassword("123456");
        waitFor(1);
        registerPage.enterConfirmPassword("123456");
        waitFor(1);
        registerPage.clickOnRegisterButton();
        String expected = "Your registration completed";
        String actualResult= registerPage.getRegistrationSuccessfullyMessage();
        Assert.assertEquals(expected, actualResult);
    }


}
