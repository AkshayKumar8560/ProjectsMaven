package FirstEvalution.day4.POM_Without_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verify_pom_without_pagefactory {
    WebDriver driver;

    @BeforeMethod
    void setup(){
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
    }
    @Test
    void loginTest(){
        POM_Wthout_Page_Factory pomWthoutPageFactory=new POM_Wthout_Page_Factory(driver);
        pomWthoutPageFactory.loginVerify("doodwalaksha123y@gmail.com","AKshay@123");
    }
    @AfterMethod
    void teardown(){
     driver.quit();
    }


}
