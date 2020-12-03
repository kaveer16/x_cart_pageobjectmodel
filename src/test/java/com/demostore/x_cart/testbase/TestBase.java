package com.demostore.x_cart.testbase;

import com.demostore.x_cart.propertyreader.PropertyReader;
import com.demostore.x_cart.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){

        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){

        closeBrowser();
    }

}
