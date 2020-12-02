package com.xcart.demostore.testsuite;

import com.xcart.demostore.pages.HomePage;
import com.xcart.demostore.pages.HotDeals;
import com.xcart.demostore.pages.SaleProducts;
import com.xcart.demostore.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {
    HomePage homePage = new HomePage();
    HotDeals hotDeals=new HotDeals();
    SaleProducts saleProducts =new SaleProducts();

    @Test
    public void VerifyUserShouldNavigateToSignInPage() {
        waitFor(1);
        homePage.clickOnSignInLink();
        homePage.clickToVerifyNewAccountBtnFunctionality();
        int num =getRandomNumeric();
        homePage.enterEmailIdToEmailField("ramkrishna"+num+"@yahoo.com");
        homePage.enterPasswordToPasswordField("Ramkrishna123");
        homePage.enterConfirmPasswordToPasswordField("Ramkrishna123");
        waitFor(5);
        homePage.clickOnCreateBtn();
        waitFor(10);
        hotDeals.clickOnHotDealsSale();
        waitFor(10);
        hotDeals.clickOnSale();
        saleProducts.clickOnLaceBootsLink();
      String  expectedMessage = "Lace-Up Boots in Light Brown";
      String  actualMessage = saleProducts.getTextToVerify();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
