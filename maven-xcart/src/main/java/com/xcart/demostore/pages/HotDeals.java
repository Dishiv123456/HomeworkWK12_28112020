package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HotDeals extends Utility {
    By hotDealsTab = By.xpath("//ul/li[2]/span[contains(text(),'Hot deals')]");
    By saleBtn = By.xpath("//*[@id=\"header-area\"]/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a/span");

    //This method will click on sale from hot deals
    public void clickOnHotDealsSale() {
        Reporter.log("clicking on sale from hot deals " + hotDealsTab + "<br>");
        mouseHoverToElement(hotDealsTab);

    }
    //This method will click on sale btn

    public void clickOnSale() {
        Reporter.log("clicking on sale from hot deals " + hotDealsTab + "<br>");
         clickOnElement(saleBtn);

    }
}