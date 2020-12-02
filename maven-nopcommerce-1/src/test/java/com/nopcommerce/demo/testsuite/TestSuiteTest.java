package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.pages.TestSuitePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuiteTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    TestSuitePage testSuitePage = new TestSuitePage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        waitFor(1);
        testSuitePage.clickOnComputerMenu();
        waitFor(1);
        testSuitePage.clickOnDesktopTab();
        waitFor(1);
        testSuitePage.mouseHoverAndClick();
        waitFor(1);
        testSuitePage.clickOnZToA();
        waitFor(1);
        List<WebElement> deskTopPCs = getListOfElements(By.xpath("//h2[@class='product-title']"));
        //Declaring the String List to store product name
        List<String> deskTopNames = new ArrayList<>();
        for (WebElement deskTop : deskTopPCs) {
            deskTopNames.add(deskTop.getText());
        }
        // Create the temp list of product name and sort it using Collections.sort method
        List<String> tempList = new ArrayList<>();
        tempList.addAll(deskTopNames);
        Collections.sort(tempList, Collections.reverseOrder());
        System.out.println(deskTopNames);
        System.out.println(tempList);
        Assert.assertEquals(deskTopNames, tempList);

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() {
        waitFor(1);
        testSuitePage.clickOnComputerMenu();
        waitFor(1);
        testSuitePage.clickOnDesktopTab();
        waitFor(1);
        testSuitePage.mouseHoverAndClick();
        waitFor(1);
        testSuitePage.clickOnAToZ();
        testSuitePage.clickOnAddToCart();
        String expectedMessage = "Build your own computer";
        String actualMessage = testSuitePage.getMessageBuildYourOwnComputer();
        Assert.assertEquals(expectedMessage, actualMessage);
        testSuitePage.selectProcessorFromField();
        testSuitePage.selectRAMFromField();
        testSuitePage.clickOnHDDRadioBtn();
        testSuitePage.clickOnOSRadioBtn();
        testSuitePage.clickOnTotalCommander();
        expectedMessage = "$1,475.00";
        actualMessage = testSuitePage.getMessageForPriceVerify();
        Assert.assertEquals(expectedMessage, actualMessage);
        testSuitePage.clickToAddCart();
        expectedMessage = "The product has been added to your shopping cart";
        actualMessage = testSuitePage.getTextFromAddToCartBtnFinal();
        Assert.assertEquals(expectedMessage, actualMessage);
        testSuitePage.clickToCrossBtnToClose();
        testSuitePage.mouseHoverToShoppingCart();
        testSuitePage.clickOnGoToCart();
        waitFor(1);
        testSuitePage.clickToClearAddQtyBox();
        waitFor(1);
        testSuitePage.sendTextToAddQtyBox();
        testSuitePage.clickToUpdateShoppingCart();
        expectedMessage = "$2,950.00";
        actualMessage = testSuitePage.getMessageToVerifyUpdateCart();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
