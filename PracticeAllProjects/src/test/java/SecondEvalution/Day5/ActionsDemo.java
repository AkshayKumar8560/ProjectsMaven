package SecondEvalution.Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActionsDemo {
    WebDriver driver;
    @BeforeMethod
    void setup(){
        driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
    }

    @Test()
    void veifytest(){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Akshay@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Akshay@123");
        WebElement loginbtn= driver.findElement(By.xpath("//button[@name='login']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(loginbtn).click().build().perform();

    }
}
