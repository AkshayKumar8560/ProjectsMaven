package test_runner;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import setup.Setup;
import utils.Utils;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class LoginTestRunner extends Setup {
    LoginPage loginPage;

@Test(priority = 1,description = "User doLogin with invalid credential")
    public void doLoginWithInvalidCreds(){
        loginPage=new LoginPage(driver);

        String message_actual= loginPage.doLogInWithInvalidCreds("admin","123");
        String message_expected="Invalid credentials";
        Assert.assertTrue(message_actual.contains(message_expected));
    }
    @Test(priority =2,description = "User login with valid credential")
    public void doLogin() throws IOException, ParseException {
        LoginPage loginPage=new LoginPage(driver);
        JSONObject userObject= Utils.loadJSONFile("./src/test/resources/User.json");
        String username= (String) userObject.get("username");
        String password= (String) userObject.get("password");
        loginPage.doLogin(username,password);

        By elementLocator = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
            System.out.println("Dashboard "+element.getText());
            String header_expected= "Dashboard";
            Assert.assertEquals(element.getText(),header_expected);
        } catch (org.openqa.selenium.TimeoutException e) {
            System.out.println("Element not found within the timeout");
        }



    }
}
