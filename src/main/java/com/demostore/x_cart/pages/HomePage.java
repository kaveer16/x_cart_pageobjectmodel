package com.demostore.x_cart.pages;

import com.demostore.x_cart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By signInSignUpLink = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[2]/div[3]/button[1]/span[1]");
    public void clickOnSignInSignUpLink(){
        Reporter.log("clicking on sign in sign up link" + signInSignUpLink.toString() + "<br>");
        clickOnElement(signInSignUpLink);
    }


}
