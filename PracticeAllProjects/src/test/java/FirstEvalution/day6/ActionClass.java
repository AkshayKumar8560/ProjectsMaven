package FirstEvalution.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class ActionClass {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        // 1 st
        driver.get("http://omayo.blogspot.com/");
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.id("blogsmenu"));
        WebElement element1=driver.findElement(By.xpath("//a/span[text()='SeleniumOneByArun']"));
        actions.moveToElement(element).perform();
        actions.sendKeys(element1).perform();
        //actions.moveToElement(element1).click().build().perform();


        //2nd
       /* driver.get("https://www.facebook.com");
        WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("doodwalaksaqqhy@gmail.com");
        WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
        pass.sendKeys("doodwalaksaqqhy@123");

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();*/



    }
}
