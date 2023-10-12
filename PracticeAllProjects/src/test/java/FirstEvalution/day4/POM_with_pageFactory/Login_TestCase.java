package FirstEvalution.day4.POM_with_pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Login_TestCase {
    WebDriver driver;
    @BeforeMethod
    void setup(){
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

    }
    @Test
    void logintest(){
        LoginPage page=PageFactory.initElements(driver,LoginPage.class);
        page.loginverify_Page("doodwalakshay@gmail.com","Akshay@123");
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
