package com.demostore.x_cart.pages;

import com.demostore.x_cart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class MyAccountPage extends Utility {
    By myAccountText = By.xpath("//h1[@id='page-title']");
    By hotDealsTab = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]");
    By salesTab = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]");
    By laceUpBootsProduct = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/ul[1]/li[3]/div[1]/h5[1]");
    By laceUpBootsInLightBrownText = By.xpath("//h1[contains(text(),'Lace-Up Boots in Light Brown')]");


    //Method to verify My account text
    public String getMyAccountText(){
        return getTextFromElement(myAccountText);
    }
    //Method to mouse hover to hot deals
    public void toSelectHotDeals(){
        Reporter.log("click on hot deals" + hotDealsTab.toString() + "<br>");
        mouseHoverToElement(hotDealsTab);
    }
    //Method to mouse hover to hot deals
    public void clickOnSales(){
        Reporter.log("click on hot deals" + salesTab.toString() + "<br>");
        mouseHoverToElementAndClick(salesTab);
    }
    public void clickOnLaceUpBootsInLightBrown(){
        Reporter.log("Clicking on LaceUpBootsLightBrown" + laceUpBootsProduct.toString() + "<br>");
        clickOnElement(laceUpBootsProduct);
    }
    public String getLaceUpBootsInLightBrownText(){
        return getTextFromElement(laceUpBootsInLightBrownText);

    }

}
