package com.demostore.x_cart.pages;

import com.demostore.x_cart.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class SignInPage extends Utility {

    By signInText = By.xpath("//span[@id='ui-id-3']");
    By createNewAccountLink = By.xpath("//tbody/tr[4]/td[1]/a[1]");
    By newAccountText = By.xpath("//span[@id='ui-id-12']");


    // Method to click on create new account
    public void mouseHoverToCreateNewAccountAndClick(){
        Reporter.log("clicking on create new account link" + createNewAccountLink.toString() + "<br>");
        mouseHoverToElementAndClick(createNewAccountLink);

    }

    // Method to verify that the new page for sign in/sign up is open, having Sign In Text
    public String getSignInText(){
        return getTextFromElement(signInText);
    }
    //Method to verify the Text New Account On sign up page
    public String getNewAccountText(){
        return getTextFromElement(newAccountText);
    }

}
