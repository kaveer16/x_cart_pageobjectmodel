package com.demostore.x_cart.pages;

import com.demostore.x_cart.utility.Utility;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class NewAccountPage extends Utility {

    By newAccountText = By.xpath("//span[@id='ui-id-12']");
    By emailField = By.xpath("//body/div[14]/div[2]/form[1]/div[2]/div[1]/ul[1]/li[1]/div[3]/span[1]/input[1]");
    By passwordField = By.xpath("//body/div[14]/div[2]/form[1]/div[2]/div[1]/ul[1]/li[2]/div[3]/span[1]/input[1]");
    By confirmPasswordField = By.xpath("//body/div[14]/div[2]/form[1]/div[2]/div[1]/ul[1]/li[3]/div[3]/span[1]/input[1]");
    By createButton = By.xpath("//body/div[14]/div[2]/form[1]/div[2]/div[2]/div[1]/button[1");

    //Method to verify the Text New Account On sign up page
    public String getNewAccountText(){

        return getTextFromElement(newAccountText);
    }

    // Method to random send text to email field
    public void enterEmailField(String email){
        Reporter.log("Enter Email" + email + "to email field" + emailField.toString() + "<br>");

    }

    // Method to send text to password field
    public void enterPassword(String password){
        Reporter.log("Enter password" + password + "to password field" + passwordField.toString() + "<br>");
        sendTextToElement(passwordField,password);
    }
    // Method to send text to confirm password field
    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log("Enter confirm password" + confirmPassword + "to password field" + confirmPasswordField.toString() + "<br>");
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    //Method to click on Create
    public void clickOnCreateButton(){
        Reporter.log("Clicking on Create Button" + "<br>");
        clickOnElement(createButton);
    }
    public void randomGeneratorEmail(){

    }

}
