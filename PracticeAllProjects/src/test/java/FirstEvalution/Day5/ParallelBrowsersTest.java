package FirstEvalution.Day5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class ParallelBrowsersTest {
    WebDriver driver;
   /* @Test
    public void test() throws InterruptedException {
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        WebElement text=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        Thread.sleep(3000);
        //WebElement btn=driver.findElement(By.name("btnK"));
        Actions act=new Actions(driver);
        act.keyDown(Keys.SHIFT);
        act.moveToElement(text).sendKeys("divya singh").keyUp(Keys.SHIFT).build().perform();
        text.submit();
        //System.out.println("method 1" +Thread.currentThread());
        Thread.sleep(5000);
    }
    @Test
    public void testTitle() throws InterruptedException {
        driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        WebElement text=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        Thread.sleep(3000);
        //WebElement btn=driver.findElement(By.name("btnK"));
        Actions act=new Actions(driver);
        act.keyDown(Keys.SHIFT);
        act.moveToElement(text).sendKeys("meaning of AKshay").keyUp(Keys.SHIFT).build().perform();
        text.submit();
       *//* WebElement link=driver.findElement(By.xpath("//h3[contains(text(),'Divya: Name Meaning, Origin & More | MyloFamily')]"));
        link.click();
        Thread.sleep(5000);
        String title="Divya: Name Meaning, Origin & More | MyloFamily";
        System.out.println("method 2");
        String currTitle= driver.getTitle();
        System.out.println(currTitle);
        Assert.assertEquals(title,currTitle);*//*
    }
*//*   @Test
   public void testCaseOne() {
       //Printing Id of the thread on using which test method got executed
       System.out.println("Test Case One with Thread Id:- "
               + Thread.currentThread().getId());
   }

    @Test
    public void testCaseTwo() {
        ////Printing Id of the thread on using which test method got executed
        System.out.println("Test Case two with Thread Id:- "
                + Thread.currentThread().getId());
    }*/

   /* @AfterMethod
    public void closeWindow(){

        driver.quit();
    }
*/



    @Test
    public void FirefoxTest() {
        //Initializing the firefox driver (Gecko)
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(Thread.currentThread().getId());
        driver.close();
    }

    @Test
    public void ChromeTest()
    {
        //Initialize the chrome driver
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(Thread.currentThread().getId());

        driver.close();
    }
}