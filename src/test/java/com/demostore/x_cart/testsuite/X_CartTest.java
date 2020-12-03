package com.demostore.x_cart.testsuite;

import com.demostore.x_cart.pages.HomePage;
import com.demostore.x_cart.pages.MyAccountPage;
import com.demostore.x_cart.pages.NewAccountPage;
import com.demostore.x_cart.pages.SignInPage;
import com.demostore.x_cart.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class X_CartTest extends TestBase {
    SignInPage signInPage = new SignInPage();
    HomePage homePage = new HomePage();
    NewAccountPage newAccountPage = new NewAccountPage();
    MyAccountPage myAccountPage = new MyAccountPage();



    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnSignInSignUpLink();
        String expectedMessage = "Sign in";
        String actualMessage = signInPage.getSignInText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void verifyUserShouldCreateAccountSuccessfully() {

        verifyUserShouldNavigateToLoginPage();
        signInPage.mouseHoverToCreateNewAccountAndClick();
        waitFor(2);
        int num = getRandomNumeric();
        newAccountPage.enterEmailField("kaveer" + num + "gmail.com");
        waitFor(2);
        newAccountPage.enterPassword("Hello11");
        waitFor(2);
        newAccountPage.enterConfirmPassword("Hello11");
        waitFor(2);
        newAccountPage.clickOnCreateButton();
        waitFor(2);
        String expectedMessage = "My account";
        String actualMessage = myAccountPage.getMyAccountText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }
    @Test
    public void verifyUserShouldBeAbleToChooseLaceUpBoots(){
        verifyUserShouldCreateAccountSuccessfully();
        waitFor(2);
        myAccountPage.toSelectHotDeals();
        waitFor(2);
        myAccountPage.clickOnSales();
        waitFor(2);
        myAccountPage.clickOnLaceUpBootsInLightBrown();
        waitFor(2);
        myAccountPage.getLaceUpBootsInLightBrownText();
        String expectedMessage = "Lace Up Boots In Light Brown";
        String actualMessage = myAccountPage.getLaceUpBootsInLightBrownText();
        Assert.assertEquals(expectedMessage,actualMessage);


    }


}