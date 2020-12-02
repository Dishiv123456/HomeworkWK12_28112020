package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class SaleProducts extends Utility {
    By bootsLink= By.xpath("//h5/a[@href='lace-up-boots-in-light-brown']");
By getMessage=By.xpath("//h1[contains(text(),'Lace-Up Boots in Light Brown')]");

    //this Method will click on boots link
    public void clickOnLaceBootsLink(){
        Reporter.log("clicking on boots "+ bootsLink+"<br>");
        clickOnElement(bootsLink);
    }
    //This method will get text to verify
    public String getTextToVerify(){
        Reporter.log(" verify message "+ getMessage+"<br>");
     return   getTextFromElement(getMessage);
    }
}
