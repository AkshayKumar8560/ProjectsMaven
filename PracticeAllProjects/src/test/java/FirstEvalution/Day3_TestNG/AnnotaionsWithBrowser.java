package FirstEvalution.Day3_TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.time.Duration;

public class AnnotaionsWithBrowser {
    WebDriver driver;
    @BeforeMethod
     void setup(){
        driver=new ChromeDriver();
       // driver.get("");
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().deleteAllCookies();
    }


    @Test
    void facebookLoginVerify(){
      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Akshay@gmail.com");
      driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Akshay@123");
      driver.findElement(By.xpath("//button[@name='login']")).click();
    }
    @Test
    public void CreateNewAccountBtnVerify(){
    // driver.findElement(By.xpath("//a[@id='u_0_0_tF']")).click();
     driver.findElement(By.partialLinkText("Create new account")).click();
     //Assert.assertTrue(true,"It's quick and easy.");




    }



    @AfterMethod
    void tearDown(){
        driver.quit();
    }


}
