package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class TestSuitePage extends Utility {
    By computerMenu = By.xpath("//ul[@class='top-menu notmobile']/li[1]");
    By desktopTab = By.xpath("//a[contains(text(),' Desktops ')]");
    By sortByMouseHover = By.xpath("//select[@id='products-orderby']");
    By clickOnZToA = By.xpath("//select[@id='products-orderby']/option[3]");
    //List<WebElement> getTextFromList = (List<WebElement>) By.xpath("//h2[@class='product-title']");
    By clickOnAToZ = By.xpath("//select[@id='products-orderby']/option[2]");
    By addToCartBtn = By.xpath("//body/div[6]//div[1]/div/div[2]/div[3]/div[2]/input[1]");
    By getBuildOwnComputer = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectProcessorField = By.xpath("//select[@id='product_attribute_1']");
    By clickOnRAM = By.xpath("//select[@id='product_attribute_2']");
    By clickOnHDDRadioBtn = By.xpath("//dd[@id='product_attribute_input_3']/ul/li[2]//label[contains(text(),'400 GB [+$100.00]')]");
    By clickOnOSRadioBtn = By.xpath("//dd[@id='product_attribute_input_4']//li[2]//label[contains(text(),'Vista Premium [+$60.00]')]");
    By clickOnTotalCommander = By.xpath("//dd[@id='product_attribute_input_5']//li[3]/input");
    By priceVerifyMessage = By.xpath("//span[contains(text(),'$1,475.00')]");
    By addToCartBtnFinal = By.xpath("//input[@id='add-to-cart-button-1']");
    By getTextCartBtnFinal = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By crossBtnClose = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCartBtn = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goTOCartBtn = By.xpath("//body/div[6]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/input[1]");
    By updateShoppingCart = By.xpath("//input[@class='qty-input']");
    By clickToUpdateCart = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]");
    By getMessageToUpdateCart = By.xpath("//tbody/tr[1]/td[7]/span[1]");

    //This method will click on computer menuBy.xpath("//body/div[@id='bar-notification']/div[1]/p[1]")
    public void clickOnComputerMenu() {
        Reporter.log("click on Computers  " + computerMenu + "<br>");
        clickOnElement(computerMenu);
    }

    //This Method will click on desktopTab
    public void clickOnDesktopTab() {
        Reporter.log("click on desktop  " + desktopTab + "<br>");
        clickOnElement(desktopTab);
    }

    //This method will mouseHover to sort By and click
    public void mouseHoverAndClick() {
        Reporter.log("mouse hover to element and click  " + sortByMouseHover + "<br>");
        mouseHoverToElementAndClick(sortByMouseHover);
    }

    //This method will select Z to A for sort by
    public void clickOnZToA() {
        Reporter.log("click on Z to A  " + clickOnZToA + "<br>");
        clickOnElement(clickOnZToA);
    }

    //This method will select a to z
    public void clickOnAToZ() {
        Reporter.log("click on a to z  " + clickOnAToZ + "<br>");
        clickOnElement(clickOnAToZ);
    }

    //This method will click on add to cart button
    public void clickOnAddToCart() {
        Reporter.log("click on add to cart btn  " + addToCartBtn + "<br>");
        clickOnElement(addToCartBtn);
    }

    //this method will get text Build your own computer
    public String getMessageBuildYourOwnComputer() {
        Reporter.log("get message build your own computer " + getBuildOwnComputer + "<br>");
        return getTextFromElement(getBuildOwnComputer);
    }

    //This method to select Processor for field
    public void selectProcessorFromField() {
        Reporter.log("select 2.2 GHz Intel Pentium Dual-Core E2200 " + selectProcessorField + "<br>");
        clickOnElement(selectProcessorField);
        selectByIndex(selectProcessorField, 0);
    }

    //This method will select RAM from RAM field
    public void selectRAMFromField() {
        Reporter.log("select 8GB RAM  " + clickOnRAM + "<br>");
        selectByIndex(clickOnRAM, 2);
    }

    //This method will click on HDD radio button 400 GB [+$100.00]
    public void clickOnHDDRadioBtn() {
        Reporter.log("click on HDD radio button  " + clickOnHDDRadioBtn + "<br>");
        clickOnElement(clickOnHDDRadioBtn);
    }

    //This method will click on HDD radio button Vista Premium [+$60.00]
    public void clickOnOSRadioBtn() {
        Reporter.log("click on HDD radio button  " + clickOnOSRadioBtn + "<br>");
        clickOnElement(clickOnOSRadioBtn);
    }

    //This method will click on To0tal Commander [+$5.0]
    public void clickOnTotalCommander() {
        Reporter.log("click on Total Commander [+$5.0] " + clickOnTotalCommander + "<br>");
        mouseHoverToElementAndClick(clickOnTotalCommander);
    }

    //This method will Verify the price "$1,475.00
    public String getMessageForPriceVerify() {
        Reporter.log("Verify the price $1,475.00  " + priceVerifyMessage + "<br>");
        return getTextFromElement(priceVerifyMessage);
    }

    //This method will click on Add to cart btn
    public void clickToAddCart() {
        Reporter.log("click on add to cart btn" + addToCartBtnFinal + "<br>");
        clickOnElement(addToCartBtnFinal);
    }

    //This method will get text
    public String getTextFromAddToCartBtnFinal() {
        Reporter.log("get text  " + getTextCartBtnFinal + "<br>");
        return getTextFromElement(getTextCartBtnFinal);
    }

    //this method will click on cross button
    public void clickToCrossBtnToClose() {
        Reporter.log("click to close button  " + crossBtnClose + "<br>");
        mouseHoverToElementAndClick(crossBtnClose);
    }

    //This method will mouse hover to shopping cat btn
    public void mouseHoverToShoppingCart() {
        Reporter.log("click on shopping cart  " + shoppingCartBtn + "<br>");
        mouseHoverToElement(shoppingCartBtn);
    }

    //This method will click go to cart
    public void clickOnGoToCart() {
        Reporter.log("click on shopping cart  " + goTOCartBtn + "<br>");
        clickOnElement(goTOCartBtn);
    }


    //This method will clear default quantity
    public void clickToClearAddQtyBox() {
        Reporter.log("clear default quantity " + updateShoppingCart + "<br>");
        driver.findElement(updateShoppingCart).clear();
    }

    //This method will add qty 2
    public void sendTextToAddQtyBox() {
        Reporter.log("add 2 on quantity box " + updateShoppingCart + "<br>");
        sendTextToElement(updateShoppingCart, "2");
    }

    //this method will update shopping cart
    public void clickToUpdateShoppingCart() {
        Reporter.log("update shopping cart " + clickToUpdateCart + "<br>");
        clickOnElement(clickToUpdateCart);
    }

    //This method will get text to verify
    public String getMessageToVerifyUpdateCart() {
        Reporter.log("get message to varify " + getMessageToUpdateCart + "<br>");
        return getTextFromElement(getMessageToUpdateCart);
    }
}
